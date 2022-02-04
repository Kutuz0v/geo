package ua.hurin.geospringdata.exeption

import org.springframework.http.HttpStatus

data class ApiError(
    val errorCode: String,
    val description: String
)