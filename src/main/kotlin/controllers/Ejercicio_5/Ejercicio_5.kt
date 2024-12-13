package controllers.Ejercicio_5

import controllers.Exe1.scan
import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*

fun main(){

    //Llamamos a la funcion de abrir scanner
    val scan: Scanner = abrirScanner()

    //Llamamos a la funcion "pedirNumero"
    println("Bienvenido al Menu")
    val numero = pedirNumero("Pon un numero del 1 al 4",scan)

    //Llamamos a la funcion "Menu"
    val lista = menu(numero)


    //LLamamos a la funcion de cerrar scanner
    cerrarScanner(scan)

}
fun pedirNumero (msg: String, numero: Int, scan: Scanner):Int{
    //Le imprimos el mensaje por pantalla
    println(msg)

    //El usuario da un numero
    val numero_user = scan.nextInt()

    //Devolvemos el valor
    return numero_user

}

//Hacemos una funcion para hacer el menu
fun menu (msg:String, numero:Int, scan: Scanner): Int {

    //Hacemos un when que si el usuario da un numero del 1 al 4 llamara a una funcion
    when(numero){
        1 -> {
            push()
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

    return numero
}
fun pila (valors: Int) {
    val pila = arrayOfNulls<Int>(10)

    try {
        pila[11] = valors
    }catch (e: ArrayIndexOutOfBoundsException){
        println("La pila es troba plena")
    }

}