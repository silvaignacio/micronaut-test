package cl.dominalo.repository

import cl.dominalo.domain.Service
import io.micronaut.data.annotation.Query
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.POSTGRES)
interface ServiceRepository : CrudRepository<Service, Long> {
    @Query("SELECT * FROM Service AS s")
    fun listServices(): List<Service?>?
}