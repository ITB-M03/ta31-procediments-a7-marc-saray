package controllers.Ejercicio_3


import java.util.*

fun main() {
    //Obrir scanner
    val scan: Scanner = openScan()

    // Demanar les dades
    val preu = scanNum("Introdueix un número: ", scan)
    val IVA = scan("Introdueix un tipus d'IVA: ", scan)
    val data = scanDate("Introdueix un data: ", scan)


    // Calcular l'IVA
    val preuIVA = validarSuperusuari(preu, IVA, data)

    //Mostrar el resultat
    showResultat(preuIVA)

    //Tancar scanner
    closeScan(scan)
}

/**
 *@author SarayV
 * @version 1.0
 *
 *@param msg missatge per imprimir
 * @param scan scaneja un número
 * @return el número escanejat
 */
fun scanNum(msg: String, scan: Scanner): Int {
    val numero: Int

    println(msg)

    numero = scan.nextInt()

    return numero
}

/**
 *@author SarayV
 * @version 1.0
 *
 *@param msg missatge per imprimir
 * @param scan scaneja un string
 * @return el string escanejat
 */
fun scan(msg: String, scan: Scanner): String {
    val iva: String

    println(msg)

    iva = scan.next()

    return iva.lowercase()
}

/**
 *@author SarayV
 * @version 1.0
 *
 *@param msg missatge per imprimir
 * @param scan scaneja un string
 * @return el string escanejat
 */
fun scanDate(msg: String, scan: Scanner): String {
    val date: String

    println(msg)

    date = scan.nextLine().toString()

    return date
}

/**
 *@author SarayV
 * @version 1.0
 *
 *@param num número que ens dona l'usuari
 * @param quantitat quantita que volem sumar-li al número
 * @return resultat de la suma
 */
fun validarSuperusuari(preu: Int, iva: String, consulta: String): Double {

    var general = 0.0
    var reduit = 0.0
    var superReduit = 0.0
    var exempt = 0.0

    var resultat = 0.0

    when(iva){
        "genereal" -> resultat = preu * general
        "reduit" -> resultat = preu * reduit
        "reduït" -> resultat = preu * reduit
        "superreduit" -> resultat = preu * superReduit
        "exempt" -> resultat = preu * exempt
    }

    return resultat
}

/**
 *@author SarayV
 * @version 1.0
 *
 *@param resultat imprimeix el resultat de la suma amb un missatge
 */
fun showResultat(resultat: Double) {
    print("El resultat del preu amb el IVA és: $resultat")
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
