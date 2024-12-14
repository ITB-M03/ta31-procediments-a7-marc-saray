package controllers.Ejercicio_4

import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*

fun main(){



    //LLamamos a la funcion de abrir scanner
    val scan: Scanner = abrirScanner()

    //Llamamos a la funcion de "ponerTexto"
    val titulo = ponerTexto("Escriba algo: ", scan)

    //Llamamos a la funcion de imprimir por pantalla
    titol(titulo)

    //LLamamos a la funcion de cerrar scanner
    cerrarScanner(scan)

}
/**
 *@author Marc Cuenca
 * @version 1.0
 *
 *@param msg imprime un mensaje al usuario
 * @param scan scanea una frase
 * @return Devuelve la frase
 */

//Creamos la funcion pedirTexto para que el usuario de un texto
fun ponerTexto(msg: String, scan: Scanner): String{

    //Imprimimos el mensaje que leera el usuario
    print(msg)

    //Leemos la frase que dara el usuario
    val frase: String = scan.nextLine()

    //Devolvemos el valor
    return frase
}

/**
 *@author Marc Cuenca
 * @version 1.0
 *
 *@param msg imprime un mensaje al usuario
 * @param espaciosAntes hacemoss el calculo del tamaño de la pantalla menos la longitud de la frase entre 2
 * @param espaciosDespues hacemos lo mismo pero le restamos la val espacio antes
 * @param repeat hacemos bucles con cada variable correspondiente y depende del nuemero que haya dado imprimira espacios
 */

//Creamos la funcion de espacios en blanco
fun titol (frase:String) {

    //Creamos el numero de espacios de la pantalla
    val tamanoPantalla = 80

    //Hacemos 2 varibles de antes y despues de la frase
    val espaciosAntes = tamanoPantalla - frase.length / 2
    val espaciosDespues = tamanoPantalla - frase.length - espaciosAntes

    //Creamos un bucle para agregar los espacios antes de la frase
    repeat(espaciosAntes) {
        print(" ")
    }

    //Imprimimos la frase
    println(frase)

    //Creamos un bucle para agregar los espacios despues de la frase
    repeat(espaciosDespues) {
        print(" ")
    }
    println() //Salto de liena
}