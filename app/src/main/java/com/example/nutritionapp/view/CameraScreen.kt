package com.example.nutritionapp.view

import android.content.res.Configuration
import android.util.Log
import android.view.ViewGroup
import android.widget.Toast
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import com.example.nutritionapp.R
import com.example.nutritionapp.ui.theme.CardBlack
import com.example.nutritionapp.utils.BarCodeAnalyser
import com.example.nutritionapp.view.cameraview.TransparentClipView
import com.example.nutritionapp.viewmodel.ProductViewModel
import com.google.common.util.concurrent.ListenableFuture
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

@Composable
fun CameraPreview(
    productViewModel: ProductViewModel? = null, navController: NavController? = null,
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    var preview by remember { mutableStateOf<Preview?>(null) }
    val barCodeVal = remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
        AndroidView(
            factory = { AndroidViewContext ->
                PreviewView(AndroidViewContext).apply {
                    this.scaleType = PreviewView.ScaleType.FILL_CENTER
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT,
                    )
                    implementationMode = PreviewView.ImplementationMode.COMPATIBLE
                }
            },
            modifier = Modifier
                .fillMaxSize(),
            update = { previewView ->
                val cameraSelector: CameraSelector = CameraSelector.Builder()
                    .requireLensFacing(CameraSelector.LENS_FACING_BACK)
                    .build()
                val cameraExecutor: ExecutorService = Executors.newSingleThreadExecutor()
                val cameraProviderFuture: ListenableFuture<ProcessCameraProvider> =
                    ProcessCameraProvider.getInstance(context)
                cameraProviderFuture.addListener({
                    preview = Preview.Builder().build().also {
                        it.setSurfaceProvider(previewView.surfaceProvider)
                    }
                    val cameraProvider: ProcessCameraProvider = cameraProviderFuture.get()
                    val barcodeAnalyser = BarCodeAnalyser { barcodes ->
                        barcodes.forEach { barcode ->
                            barcode.rawValue?.let { barcodeValue ->
                                barCodeVal.value = barcodeValue
                                Toast.makeText(context, barcodeValue, Toast.LENGTH_SHORT).show()
                                productViewModel?.barcode = barcodeValue
                                navController?.navigate("products")


                            }
                        }
                    }
                    val imageAnalysis: ImageAnalysis = ImageAnalysis.Builder()
                        .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                        .build()
                        .also {
                            it.setAnalyzer(cameraExecutor, barcodeAnalyser)
                        }

                    try {
                        cameraProvider.unbindAll()
                        cameraProvider.bindToLifecycle(
                            lifecycleOwner,
                            cameraSelector,
                            preview,
                            imageAnalysis
                        )
                    } catch (e: Exception) {
                        Log.d("TAG", "CameraPreview: ${e.localizedMessage}")
                    }
                }, ContextCompat.getMainExecutor(context))
            }
        )

        Column {
            Box(modifier = Modifier.fillMaxSize()) {
                TransparentClipView(
                    modifier = Modifier.fillMaxSize(),
                    width = 350.dp,
                    height = 190.dp,
                    offsetY = 100.dp
                )

                val isLandScape: Float
                val isEnableButton: Boolean
                val configuration = LocalConfiguration.current
                when (configuration.orientation) {
                    Configuration.ORIENTATION_LANDSCAPE -> {
                        isLandScape = 0f
                        isEnableButton = false
                    }
                    else -> {
                        isLandScape = 0.9f
                        isEnableButton = true
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 30.dp, bottom = 50.dp)
                        .height(250.dp)
                        .align(Alignment.BottomCenter)
                        .alpha(isLandScape),
                    shape = RoundedCornerShape(20.dp),
                    elevation = 20.dp,
                    backgroundColor = CardBlack,

                ) {

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
                            contentDescription = "", modifier = Modifier
                                .size(100.dp)
                                .padding(top = 10.dp)
                        )

                        Text(
                            fontWeight = FontWeight.ExtraBold,
                            text = "Welcome to NutriApp",
                            fontSize = 30.sp,
                            textAlign = TextAlign.Center
                        )

                        Button(
                            onClick = {
                                navController?.navigate("search")
                            },
                            modifier = Modifier
                                .padding(start = 20.dp, end = 20.dp, bottom = 5.dp, top = 30.dp)
                                .fillMaxWidth()
                                .alpha(.2f),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                backgroundColor = Color.DarkGray,
                            ), enabled = isEnableButton

                        ) {

                            Text(
                                textAlign = TextAlign.Start,
                                fontSize = 25.sp,
                                text = "Search",
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold
                            )

                        }
                    }


                }
            }
        }

    }
}

