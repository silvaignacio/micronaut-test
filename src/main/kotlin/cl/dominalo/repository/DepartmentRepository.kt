package cl.dominalo.repository

import cl.dominalo.domain.Department
import io.micronaut.data.annotation.Query
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import java.awt.print.Book




@JdbcRepository(dialect = Dialect.POSTGRES)
interface DepartmentRepository : CrudRepository<Department, Long> {
    @Query("SELECT * FROM Department AS d")
    fun listDepartments(): List<Department?>?
}