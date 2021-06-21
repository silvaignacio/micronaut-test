package cl.dominalo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("cl.dominalo")
		.start()
}

