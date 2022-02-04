package ua.hurin.geospringdata.controller

import org.springframework.web.bind.annotation.*
import ua.hurin.geospringdata.dto.CountryDto
import ua.hurin.geospringdata.model.Country
import ua.hurin.geospringdata.service.CountryService

@RestController
@RequestMapping("/countries")
class CountryController(
    private val countryService: CountryService
) {
    @GetMapping
    fun getAll(): List<CountryDto> = countryService.getAllCountries()

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Int): CountryDto = countryService.getById(id)

    @PostMapping
    fun create(@RequestBody dto: CountryDto) {
        countryService.create(dto)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody dto: CountryDto) {
        countryService.update(id, dto)
    }

    @DeleteMapping("/{id}")
    fun update(@PathVariable id: Int) {
        countryService.deleteById(id)
    }
}