package com.example.prueba.repository


import com.example.prueba.model.Tratamiento
import org.springframework.data.jpa.repository.JpaRepository

interface TratamientoRepository: JpaRepository<Tratamiento, Long> {
    fun findById (id: Long?): Tratamiento?
}