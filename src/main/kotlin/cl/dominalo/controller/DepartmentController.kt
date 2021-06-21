package cl.dominalo.controller

import cl.dominalo.domain.Department
import cl.dominalo.repository.DepartmentRepository
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import javax.inject.Inject

@Controller("/department")
class DepartmentController {

    @Inject
    private lateinit var repository: DepartmentRepository

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): List<Department?>? {
        return repository.listDepartments()
    }
}