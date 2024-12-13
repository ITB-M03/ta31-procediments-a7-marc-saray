package controllers.Ejercicio_5

import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*

fun main() {
    // Llamamos a la función de abrir scanner
    val scan: Scanner = abrirScanner()

    // Llamamos a la función "pedirNumero"
    println("Bienvenido al Menú")
    val numero = pedirNumero("Pon un número del 1 al 4", scan)

    // Llamamos a la función "Menu"
    val lista = menu(numero)

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
fun menu (msg:String, numero:Int, scan: Scanner): String {

    //Hacemos un when que si el usuario da un numero del 1 al 4 llamara a una funcion
    when(numero){
        1 -> {
            push(pila(), false, 9)
        }
        2 -> {
            pop()
        }
        3 -> {
            pila()
        }
        4 ->{
            salir()
        }
        else ->{
            println("Ese numero no vale, pon otro")
        }
    }
    return when


}
fun pila (): Array<Int?> {
    val pila = arrayOfNulls<Int>(10)
    return pila
}
fun push (pila: Array<Int>, numero: Int): Array<Int>{
    var plena = false
    try {
        var index = 0
        if (!plena) {
            pila.set(numero, index)
            index ++
        }
    }catch (e: ArrayIndexOutOfBoundsException){
        println("La pila es troba plena")
        plena = true
    }
    return pila

    for (i in pila.indices){
        if (pila.lastIndex == null){
    }
}
