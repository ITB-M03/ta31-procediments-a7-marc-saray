package controllers.Ejercicio_5

import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*

data class Pila (
    val elementos: Array<Int> = Array<Int>(10){ 0 },
    var top : Int = 0
)

fun main() {
    // Llamamos a la función de abrir scanner
    val scan: Scanner = abrirScanner()

    val pila = crearPila()

    // Llamamos a la función "pedirNumero"
    println("Bienvenido al Menú")

    //Funcion para mostrar menu
    listadoMenu()

    val numero = pedirNumero("Pon un número del 1 al 4: ", scan)


    // Llamamos a la función "Menu"
    val lista = menu(numero, pila)



    // Llamamos a la función de cerrar scanner
    cerrarScanner(scan)
}

// Función para pedir un número al usuario
fun pedirNumero(msg: String, scan: Scanner): Int {
    // Imprimimos el mensaje por pantalla
    println(msg)

    // El usuario da un número
    val numero_user = scan.nextInt()

    // Devolvemos el valor
    return numero_user
}
//Hacemos una funcion para hacer el menu
fun menu(numero: Int, pila: Pila) {

     when (numero) {
        1 -> {
            push(pila, numero)
        }
        2 -> {

        }
        3 -> {
            mostrar(pila)
        }
        4 -> {
        }
        else -> {
        }
    }
}

fun crearPila (): Pila {
    val pila = Pila()
    return pila
}
fun push (pila: Pila, numero: Int){
    if (pila.top == 10){
        println("Pila llena")
    } else {
        pila.elementos[pila.top] = numero
        pila.top++
    }
}








//Creamos la funcion de imprimir el menu
fun listadoMenu (){
    println("1.- Afegir número (push)")
    println("2.- Treure número (pop)")
    println("3.- Mostrar contingut de la pila")
    println("4.- Sortir")
}

//Creamos la funcion mostrar pila
fun mostrar(pila: Pila){
    println(pila.elementos.contentToString())
}
