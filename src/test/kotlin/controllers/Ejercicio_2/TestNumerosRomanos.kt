package controllers.Ejercicio_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TestNumerosRomanos {

    @Test
    fun roman1() {
        val esperado = "X"

        assertEquals(esperado, roman(10))
    }

    @Test
    fun roman2() {
        val esperado = "MMMDCCCLXXXVIII"

        assertEquals(esperado, roman(3888))
    }

    @Test
    fun roman3() {
        val esperado = "MMMMCMXCIX"

        assertEquals(esperado, roman(4999))
    }

}



