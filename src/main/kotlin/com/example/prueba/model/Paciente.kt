package com.example.prueba.model

import javax.persistence.*

@Entity
@Table(name = "paciente")

class Paciente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var edad: String? = null
    @Column(name="doctor_id")
    var doctorId: Long? = null
}
