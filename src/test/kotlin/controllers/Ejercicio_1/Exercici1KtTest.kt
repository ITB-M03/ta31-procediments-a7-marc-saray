package controllers.Ejercicio_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Exercici1KtTest {

@Test
 fun calculaIVA() {
  val esperat = 708.29
 assertEquals(esperat, controllers.Ejercicio_1.calculaIVA(643.9, "reduit", "11-12-2024"))
 }

@Test
 fun calculaIVA2() {}

@Test
 fun calculaIVA3() {}
}