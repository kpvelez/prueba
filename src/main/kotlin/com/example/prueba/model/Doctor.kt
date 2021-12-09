package com.example.prueba.model

import javax.persistence.*

@Entity
@Table(name = "doctor")

class Doctor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var especialidad: String? = null
}