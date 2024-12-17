package controllers.Ejercicio_3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Exercici3KtTest {

    fun validarSuperusuari1() {
        val preu = 100
        val iva = "general"
        val consulta = "01-01-2024"

        val resultat = validarSuperusuari(preu, iva, consulta)

        val esperat = 121.0
        assertEquals(esperat, resultat)
    }

    @Test
    fun validarSuperusuari2() {
        val preu = 100
        val iva = "reduit"
        val consulta = "01-01-2024"

        val resultat = validarSuperusuari(preu, iva, consulta)

        val esperat = 110.0
        assertEquals(esperat, resultat)
    }

    @Test
    fun validarSuperusuari3 () {
        val preu = 100
        val iva = "superreduit"
        val consulta = "01-01-2024"

        val resultat = validarSuperusuari(preu, iva, consulta)

        val esperat = 104.0
        assertEquals(esperat, resultat)
    }


}