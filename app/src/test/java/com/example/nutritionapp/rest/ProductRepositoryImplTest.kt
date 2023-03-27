package com.example.nutritionapp.rest

import com.example.nftapp.utils.UIState
import com.example.nutritionapp.data.model.Product
import com.example.nutritionapp.data.model.ProductResponse
import com.example.nutritionapp.data.model.domain.ProductDomain
import io.mockk.clearAllMocks
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class ProductRepositoryImplTest {

    private lateinit var testObject: ProductRepository
    private val mockServiceApi = mockk<OpenFoodAPI>(relaxed = true)
    private val testDispatcher = UnconfinedTestDispatcher()
    private val testScope = TestScope(testDispatcher)

    @Before
    fun setUp() {

        Dispatchers.setMain(testDispatcher)
        testObject = ProductRepositoryImpl(mockServiceApi, testDispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        clearAllMocks()
    }

    @Test
    fun `Get Product by Name when the Server has a Product response and return a SUCCES State `() {
        //AAA

        //Given

        coEvery {
            mockServiceApi.getProductsByTag("doritos")

            //When
        } returns mockk {
            every { isSuccessful } returns true
            every { body() } returns ProductResponse(
                listOf(
                    mockk(relaxed = true),
                    mockk(relaxed = true),
                    mockk(relaxed = true)
                )
            )
        }


        val state = mutableListOf<UIState<List<ProductDomain>>>()
        val job = testScope.launch {
            testObject.getProductByTag("doritos").collect {
                state.add(it)
            }
        }

        //Then
        assertEquals(2, state.size)
        val success = (state[1] as UIState.SUCCESS).response
        assertEquals(3, success.size)

        coEvery { mockServiceApi.getProductsByTag("doritos") }
        job.cancel()


    }

    @Test
    fun `Get Product by Code when the Server has a Product response and return a SUCCES State `() {
        //AAA

        //Given

        coEvery {
            mockServiceApi.getProductByCode("123")

            //When
        } returns mockk {
            every { isSuccessful } returns true
            every { body() } returns ProductResponse(
                listOf(
                    mockk(relaxed = true),
                    mockk(relaxed = true),
                    mockk(relaxed = true)
                )
            )
        }


        val state = mutableListOf<UIState<List<ProductDomain>>>()
        val job = testScope.launch {
            testObject.getProductByCode("123").collect {
                state.add(it)
            }
        }

        //Then
        assertEquals(2, state.size)
        val success = (state[1] as UIState.SUCCESS).response
        assertEquals(3, success.size)

        coEvery { mockServiceApi.getProductByCode("123") }
        job.cancel()


    }


}