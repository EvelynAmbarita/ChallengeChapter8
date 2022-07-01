package com.binar.challengechapter8.data.api

data class GetAllUserResponseItem(
    val alamat: String,
    val email: String,
    val id: String,
    val image: String,
    val name: String,
    val password: String,
    val tanggal_lahir: String,
    val username: String
)