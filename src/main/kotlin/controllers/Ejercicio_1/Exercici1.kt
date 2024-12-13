package controllers.Ejercicio_1

import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    //Obrir scanner
    val scan: Scanner = openScan()

    // Demanar les dades
    val preu = scanNum("Introdueix el preu: ", scan)
    val IVA = scanIVA("""Introdueix un tipus d'IVA
    0 -> General
    1 -> Reduït
    2 -> Superreduit
    3 -> Exempt""".trimMargin(), scan)
    val data = scanDate("Introdueix una data: ", scan)


    // Calcular l'IVA
    val preuIVA = calculaIVA(preu, IVA, data)

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
fun scanNum(msg: String, scan: Scanner): Double {
    val numero: Double

    println(msg)

    numero = scan.nextDouble()

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
fun scanIVA(msg: String, scan: Scanner): String {
    val iva: Int

    println(msg)

    iva = scan.nextInt()

    val tipus = arrayOf("general", "reduit", "superreduit", "exempt")

    return tipus[iva]
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
 *@param preu número que ens dona l'usuari
 * @param iva selecció del tipus d'iva que vol l'usuari
 * @param consulta data de la factura de l'usuari
 * @return resultat de la suma
 */
fun calculaIVA(preu: Double, iva: String, consulta: String): String {

    var general = 0.0
    var reduit = 0.0
    var superReduit = 0.0
    val exempt = 1.0

    val format = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val data = LocalDate.parse(consulta, format)
    when (data) {
        in LocalDate.parse("01-01-1986", format)..LocalDate.parse("31-12-1991", format)
            -> {
            general = 1.12
            reduit = 1.06
            superReduit = 1.0
        }
        in LocalDate.parse("01-01-1992", format)..LocalDate.parse("31-12-1992", format)
            -> {
            general = 1.15
            reduit = 1.06
            superReduit = 1.0
        }
        in LocalDate.parse("01-01-1993", format)..LocalDate.parse("31-12-1994", format)
            -> {
            general = 1.15
            reduit = 1.06
            superReduit = 1.03
        }
        in LocalDate.parse("01-01-1995", format)..LocalDate.parse("31-12-2009", format)
            -> {
            general = 1.16
            reduit = 1.07
            superReduit = 1.04
        }
        in LocalDate.parse("01-01-2010", format)..LocalDate.parse("15-07-2012", format)
            -> {
            general = 1.18
            reduit = 1.08
            superReduit = 1.04
        }
    }
    if (data >= LocalDate.parse("15-07-2012", format)) {
        general = 1.21
        reduit = 1.10
        superReduit = 1.04
    }

    var resultat = 0.0

    when(iva){
        "general" -> resultat = preu * general
        "reduit" -> resultat = preu * reduit
        "superreduit" -> resultat = preu * superReduit
        "exempt" -> resultat = preu * exempt
    }

    return "%.2f".format(resultat)
}

/**
 *@author SarayV
 * @version 1.0
 *
 *@param resultat imprimeix el resultat de la factura amb un missatge
 */
fun showResultat(resultat: String) {
    print("El resultat del preu amb el IVA és: ${String.format(Locale.UK, "%.2f", resultat)}")
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
