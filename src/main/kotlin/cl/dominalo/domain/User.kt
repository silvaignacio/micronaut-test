package cl.dominalo.domain

import javax.persistence.*

@Entity(name = "Users")
data class Users(
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val isActive: Boolean
)
