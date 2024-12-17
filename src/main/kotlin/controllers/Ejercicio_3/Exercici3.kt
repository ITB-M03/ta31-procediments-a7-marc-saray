package controllers.Ejercicio_3


import java.util.*

fun main() {
    //Obrir scanner
    val scan: Scanner = openScan()

    // Demanar les dades i comprovar el password
    val validar = validarSuperusuari(scan)

    //Mostrar el resultat
    showResultat(validar)

    //Tancar scanner
    closeScan(scan)
}

/**
 *@author SarayV
 * @version 1.0
 *
 * @param scan scaneja un string
 * @return resultat un Boolean que diu si el password es correcte
 */
fun validarSuperusuari(scan: Scanner): Boolean {

    println("Introdueix el password:")
    var password = scan.next()
    var resultat = false
    val passSuper = "sudo"
    var count = 0

    if (password == passSuper){
        resultat = true
    }else{
        while (count < 3){
            count ++
            println("Password incorrecte, prova altra vegada")
            password = scan.next()
        }
        print("Massa intents")
    }
    return resultat
}

/**
 *@author SarayV
 * @version 1.0
 *
 *@param resultat imprimeix el resultat de la suma amb un missatge
 */
fun showResultat(resultat: Boolean) {
    if (resultat){
        println("El password és correcte")
    }else {
        print(" el password és incorrecte. Password correcte: sudo")
    }
}

/**
 *@author SarayV
 * @version 1.0
 *
 * @return fa una variable anomenada "scan" obrint el Scanner per poder scanejar
 */
fun openScan(): Scanner {
    val scan = Scanner(System.`in`).useLocale(Locale.UK)

    return scan
}

/**
 *@author SarayV
 * @version 1.0
 *
 * @param scan agafa la variable "scan" per tancar el Scanner
 */
fun closeScan(scan: Scanner) {
    scan.close()
}
