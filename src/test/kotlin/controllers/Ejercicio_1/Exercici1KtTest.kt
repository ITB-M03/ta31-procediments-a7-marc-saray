package controllers.Ejercicio_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Exercici1KtTest {

@Test
 fun calculaIVA() {
  val esperat = 708.29
 assertEquals(esperat, calculaIVA(643.9, "reduit", "11-12-2024"))
 }

  @Test
  fun calculaIVA1() {
   val esperat = 774.68  // 21% de IVA aplicado sobre 640.0
   assertEquals(esperat, controllers.Ejercicio_1.calculaIVA(640.0, "general", "10-01-2025"))
  }

  @Test
  fun calculaIVA_IVA_Superreducido() {
   val esperat = 666.32
   assertEquals(esperat, controllers.Ejercicio_1.calculaIVA(640.0, "superreduit", "20-02-2025"))
  }
 }