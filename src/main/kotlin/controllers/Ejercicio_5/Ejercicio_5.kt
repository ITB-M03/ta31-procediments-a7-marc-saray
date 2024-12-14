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

/**
 *@author Marc Cuenca, SarayV
 * @version 1.0
 *
 * @param msg imprime el mensaje para el ususario
 * @param return devolvemos el valor del nuemro
 */

fun pedirNumero(msg: String, scan: Scanner): Int {
    print(msg)
    return scan.nextInt()
}

/**
 *@author Marc Cuenca, SarayV
 * @version 1.0
 *
 * @param return creamos la pila y le devolvemos el valor
 * @param
 */

fun crearPila(): Pila {
    return Pila()
}
/**
 *@author Marc Cuenca, SarayV
 * @version 1.0
 *
 * @param println imprimimos ciertas frases para el menu
 * @param
 */

fun listadoMenu() {
    println("1.- Afegir número (push)")
    println("2.- Treure número (pop)")
    println("3.- Mostrar contingut de la pila")
    println("4.- Sortir")
}
/**
 *@author Marc Cuenca, SarayV
 * @version 1.0
 *
 * @param salir creamos una variable booleana incialmente como falsa
 * @param while hacemos un bucle diciendo que si es un 4 saldra del programa sino no
 *
 */

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

/**
 *@author Marc Cuenca, SarayV
 * @version 1.0
 *
 * @param when creamos el menu con la variable 'opcion' del anterior funcion para saber que numero pone el usuario
 * @param return devolvemos el when y saber que numero da el usuario
 *
 */

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

/**
 *@author Marc Cuenca, SarayV
 * @version 1.0
 *
 * @param if hacemoss un if para si la posicion es la pila es 10
 * @param else si no es 10 ponemos un numero en la posicion de la pila
 *
 */

fun push(pila: Pila, numero: Int) {
    if (pila.top == 10) {
        println("La pila está llena. No puedes agregar más elementos.")
    } else {
        pila.elementos[pila.top] = numero
        pila.top++
        println("Se ha agregado el número $numero a la pila.")
    }
}
/**
 *@author Marc Cuenca, SarayV
 * @version 1.0
 *
 * @param if hacemoss un if para si la posicion es la pila es == 0
 * @param elementoEliminado creamos una variable que eliminara el numero y en la posicion que esta y se lo cambiaremos por un 0
 */

fun pop(pila: Pila) {
    if (pila.top == 0) {
        println("La pila está vacía. No puedes quitar ningún elemento.")
    } else {
        val elementoEliminado = pila.elementos[pila.top]
        pila.elementos[pila.top] = 0
        pila.top--
        println("Se ha quitado el número $elementoEliminado de la pila.")
    }
}

/**
 *@author Marc Cuenca, SarayV
 * @version 1.0
 *
 * @param if hacemos un if para si la posicion es la pila es 0
 * @param else si no es 0 imprimiremos el contenido de la pila
 *
 */

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