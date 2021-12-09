package com.example.prueba.repository

import com.example.prueba.model.Doctor
import org.springframework.data.jpa.repository.JpaRepository

interface DoctorRepository: JpaRepository<Doctor, Long> {
    fun findById (id: Long?): Doctor?
}