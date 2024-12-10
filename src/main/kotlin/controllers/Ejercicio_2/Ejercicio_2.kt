package controllers.Ejercicio_2
import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*

fun main(){

    //Llamamos a la funcion scanner
    val scan: Scanner = abrirScanner()

    //Llamamos a la funcion de "pedirNumero"
    val numero = pedirNumero("Introduce un Numero del 1 al 3999:", scan)

    //Llamamos a la funcion para convertir un entero a uno romano
    val numeroRomano = Roman(numero)

    //Llamamos a la funcion de mostrar por pantalla
    pantalla(numeroRomano)

    //Llamamos a la funcion de cerrar scanner
    cerrarScanner(scan)
}

// Creamos una funcion que sea "pedirNumero" (Entero)
fun pedirNumero(msg: String, scan: Scanner): Int {
    // Imprimimos el mensaje por pantalla
    print(msg)

    // Leemos el numero que escribe el usuario
    val num: Int = scan.nextInt()

    // Devolvemos el valor del num
    return num
}

// Creamos una funcion "intToRoman" y le pasaremos el numero que hemos pedido
// y lo convertiremos en numero Romano
fun Roman(num: Int): String {
    // Lista de pares con los símbolos romanos y sus valores
    val numeroRomano = listOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1
    )

    //Variable para almacenar el número romano resultante
    var resultado = ""

    //Recorremos la lista de números romanos
    var resto = num
    for (par in numeroRomano) {
        //Mientras el número es mayor o igual al valor de la unidad romana actual
        while (resto >= par.second) {
            resultado += par.first  // Añadimos el símbolo romano
            resto -= par.second     // Restamos el valor correspondiente
        }
    }

    //Devolvemos el número romano
    return resultado
}
//Creamos una funcion que sea mostrar por pantalla
fun pantalla (numero: String) {
    println("EL numero en Romano es: $numero")
}