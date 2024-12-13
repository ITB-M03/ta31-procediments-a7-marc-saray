package controllers.Ejercicio_5

import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*

data class Pila(
    val elementos: Array<Int> = Array(10) { 0 },
    var top: Int = 0
)

fun main() {
    val scan: Scanner = abrirScanner()
    val pila = crearPila()

    println("Bienvenido al Menú")
    iniciarMenu(pila, scan)

    cerrarScanner(scan)
}

fun iniciarMenu(pila: Pila, scan: Scanner) {
    var salir = false

    while (!salir) {
        listadoMenu()
        val opcion = pedirNumero("Pon un número del 1 al 4: ", scan)
        salir = procesarOpcion(opcion, pila, scan)
    }

    println("Contenido final de la pila:")
    mostrar(pila)
}

fun procesarOpcion(opcion: Int, pila: Pila, scan: Scanner): Boolean {
    return when (opcion) {
        1 -> {
            val numero = pedirNumero("Introduce un número para agregarlo: ", scan)
            push(pila, numero)
            false
        }
        2 -> {
            pop(pila)
            false
        }
        3 -> {
            mostrar(pila)
            false
        }
        4 -> {
            println("Saliendo del programa...")
            true
        }
        else -> {
            println("Opción no válida, por favor intenta de nuevo.")
            false
        }
    }
}

fun crearPila(): Pila {
    return Pila()
}

fun pedirNumero(msg: String, scan: Scanner): Int {
    print(msg)
    return scan.nextInt()
}

fun listadoMenu() {
    println("1.- Afegir número (push)")
    println("2.- Treure número (pop)")
    println("3.- Mostrar contingut de la pila")
    println("4.- Sortir")
}

fun push(pila: Pila, numero: Int) {
    if (pila.top == 10) {
        println("La pila está llena. No puedes agregar más elementos.")
    } else {
        pila.elementos[pila.top] = numero
        pila.top++
        println("Se ha agregado el número $numero a la pila.")
    }
}

fun pop(pila: Pila) {
    if (pila.top == 0) {
        println("La pila está vacía. No puedes quitar ningún elemento.")
    } else {
        pila.top--
        val elementoEliminado = pila.elementos[pila.top]
        pila.elementos[pila.top] = 0
        println("Se ha quitado el número $elementoEliminado de la pila.")
    }
}

fun mostrar(pila: Pila) {
    if (pila.top == 0) {
        println("La pila está vacía.")
    } else {
        println("Contenido de la pila:")
        for (i in pila.top - 1 downTo 0) {
            println(pila.elementos[i])
        }
    }
}