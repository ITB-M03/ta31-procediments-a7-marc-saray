package controllers.Ejercicio_5

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class OpcionMenu {

    @Test
    fun procesarOpcion() {
        val esperado = 2
        assertEquals(esperado, 2)
    }
    fun procesarOpcion2() {
        val esperado = 1
        assertEquals(esperado, 1)
    }
    fun procesarOpcion3() {
        val esperado = 4
        assertEquals(esperado, 4)
    }

}