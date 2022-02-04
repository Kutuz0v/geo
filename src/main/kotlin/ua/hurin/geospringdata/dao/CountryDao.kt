package ua.hurin.geospringdata.dao

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import ua.hurin.geospringdata.model.Country

interface CountryDao : CrudRepository<Country, Int> {

    @Query("select distinct c from Country c join fetch c.cities")
    fun findAllWithJoin(): List<Country>
}