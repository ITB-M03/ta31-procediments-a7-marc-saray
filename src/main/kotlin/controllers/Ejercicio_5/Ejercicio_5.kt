package controllers.Ejercicio_5

import controllers.Ejercicio_4.ponerTexto
import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*
import kotlin.collections.List

fun main(){

    //Llamamos a la funcion de abrir scanner
    val scan: Scanner = abrirScanner()

    //Llamamos a la funcion "pedirNumero"
    println("Bienvenido al Menu")
    val numero = pedirNumero("Pon un numero del 1 al 4",scan)



    //LLamamos a la funcion de cerrar scanner
    cerrarScanner(scan)

}
//Creamos la funcion de pedir numero
fun pedirNumero (msg:String,  scan: Scanner): Int{

    //Imprimimos la frase que leera el usuario
    println(msg)

    //Leemos el numero que pondra el usuario
    val numerousuario = scan.nextInt()

    //Devolvemos el numero del usuario
    return numerousuario
}
//Hacemos una funcion para hacer el menu
fun menu ()