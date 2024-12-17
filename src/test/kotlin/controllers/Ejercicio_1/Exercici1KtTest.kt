package controllers.Ejercicio_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Exercici1KtTest {

@Test
 fun calculaIVA() {
 val esperat = "708.29"
 assertEquals(esperat, calculaIVA(643.9, "reduit", "11-12-2024"))
 }

@Test
 fun calculaIVA2() {
 val esperat = "412.00"
 assertEquals(esperat, calculaIVA(400.0, "superreduit", "14-06-1994"))
 }

@Test
 fun calculaIVA3() {
 val esperat = "-395.60"
 assertEquals(esperat, calculaIVA(-344.0, "general", "02-02-1992"))
 }
/**
 *Per a les altres funcións no fa falta fer tests,
 *ja que no es modifica en ningú moment els paràmetres
 */
}