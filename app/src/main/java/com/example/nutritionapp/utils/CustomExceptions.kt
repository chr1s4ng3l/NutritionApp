package com.example.nftapp.utils

class NullAssetsResponse(message: String = "Connection response is null") : Exception(message)
class FailureResponse(message: String?) : Exception(message)