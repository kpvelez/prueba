package com.example.prueba.repository

import com.example.prueba.model.Paciente
import org.springframework.data.jpa.repository.JpaRepository

interface PacienteRepository: JpaRepository<Paciente, Long> {
    fun findById (id: Long?): Paciente?
}