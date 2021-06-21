package cl.dominalo.domain

import javax.persistence.*

@Entity
data class Service(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val description: String,
    val isActive: Boolean,
    val price: Float,
    @ManyToOne
    @JoinColumn(name="owner_id")
    val ownerId: Users
){

}
