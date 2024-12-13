package controllers.Ejercicio_5

import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*

data class classPila (
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

    val numero = pedirNumero("Pon un número del 1 al 4", scan)

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
fun menu (numero:Int, pila: classPila, scan: Scanner){
var
    //Hacemos un when que si el usuario da un numero del 1 al 4 llamara a una funcion
    when(numero){
        1 -> {
            push(pila, "introduce un numero", scan.nextInt())
        }
        2 -> {
            pop(pila)
        }
        3 -> {
            mostrar(pila)
        }
        4 ->{
          /*  salir()*/
        }
        else ->{
            println("Ese numero no vale, pon otro")
        }
    }
}
fun crearPila (): classPila {
    val pila = classPila()
    return pila
}
fun push (pila: classPila, msg: String, numero: Int){
    if (pila.top == 10){
        println("Pila llena")
    } else {
        pila.elementos[pila.top] = numero
        pila.top++
    }
}
fun pop (pila: classPila){
    pila.elementos[pila.top] = 0
    pila.top --
}
fun mostrar(pila: classPila){
    for (i in pila.elementos.indices){
        if (pila.elementos[i] != 0){
            println(pila.elementos[i])
        }
    }
}