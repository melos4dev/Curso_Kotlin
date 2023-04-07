package com.example.cursokotlin

fun main(){

    /**
     * tipos :  Int, Short, Byte, Long; Float, Double
     */
    var numero1 : Int = 2
    var numero2 = 5

    /**
     * Operadores --> + - / * %
     * Tener en cuenta  las formas abreviadas de mostrar -->
     */
    //forma abreviada 1
    println("Las sumas de $numero1 y $numero2 es " + (numero1 + numero2))

    //forma mas abreviada aun
    println("Las sumas de $numero1 y $numero2 es ${numero1 + numero2}")  //

    var d1 : Double = 2.0
    var d2 = 5.6
    var d3 = numero2
    /**
     * no cogera la parte entera y el decimal 0, hay que forzarlo a convertirlo en Double
     */
    var d3Bueno = numero2.toDouble()



    /**
     * Ejercicio --> Muestra la suma, resta, multiplicaación y division de dos numeros enteros
     * largos, ademas del resto de dividir el primero entre el segundo
     */

    var num1  : Long = 2
    var num2 : Long = 6

    var suma = num1 + num2
    var resta = num1 - num2
    var multiplicacion = num1 * num2
    var division = num1/num2
    var resto = num1 % num2

    println (suma)
    println (resta)
    println (multiplicacion)
    println (division)
    println (resto)


    /**
     * Tipo String
     * Con el signo del $ delante del nombre de la variable te evitas salir de las comillas y usar
     * el +  para aniadir una variable
     */
    var nombre = "cora"
    println("Hola soy $nombre")

    /**
     * variables constantes para no ser modificado su valor --> val
     */
    val texto = " Hola"
    println(texto)

   val texto2 : String //Asi no podriamos declarar una variable con valor nulo
  // val texo2 : String = null // tampoco valdria como valor nulo

   val texto2Nulo : String? = null /** esta variable permite que tenga valor nulo, si no lo igualamos
                                     a null, daria error y nos pediria inicializar la variable  */
    println(texto2Nulo)






















}