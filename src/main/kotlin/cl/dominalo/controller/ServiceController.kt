package cl.dominalo.controller

import cl.dominalo.domain.Service
import cl.dominalo.repository.ServiceRepository
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import javax.inject.Inject

@Controller("/service")
class ServiceController {


    @Inject
    private lateinit var repository: ServiceRepository


    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): List<Service?>? {
        return repository.listServices()
    }
}