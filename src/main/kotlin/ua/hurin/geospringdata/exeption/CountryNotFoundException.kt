package ua.hurin.geospringdata.exeption

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus


class CountryNotFoundException(val id: Int): BaseException(
    HttpStatus.NOT_FOUND,
    "country.not.found",
    "Country with id=$id not found"
) {
}