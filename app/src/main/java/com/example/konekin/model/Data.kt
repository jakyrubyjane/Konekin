package com.example.konekin.model

import com.google.gson.annotations.SerializedName

data class Data(
    val result: List<ResultItem?>? = null
)

data class ResultItem(
    val image: String? = null,
    val id: Int? = null,
    val title: String? = null
)