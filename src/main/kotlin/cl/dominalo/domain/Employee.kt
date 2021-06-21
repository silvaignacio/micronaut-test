package cl.dominalo.domain

import javax.persistence.*
import kotlin.jvm.Transient

@Entity
data class Employee(
    @Id @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "employee_id_seq"
    ) @SequenceGenerator(name = "employee_id_seq", sequenceName = "employee_id_seq") var id: Long,
    var name: String, var age: Int
) {
}