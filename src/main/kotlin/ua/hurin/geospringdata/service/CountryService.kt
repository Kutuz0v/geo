package ua.hurin.geospringdata.service

import ua.hurin.geospringdata.dto.CountryDto
import ua.hurin.geospringdata.model.Country

interface CountryService {
    fun getAllCountries(): List<CountryDto>

    fun getById(id: Int): CountryDto

    fun create(country: CountryDto)

    fun update(id: Int, country: CountryDto)

    fun deleteById(id: Int)
}