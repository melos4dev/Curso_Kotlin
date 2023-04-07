package com.example.cursokotlin

fun main() {

    var a = 3
    var b = 6
    var mayor: Int

    //expresion definida de condicion
    if (a > b) {
        mayor = a
    } else {
        mayor = b
    }

    //expresion más compacta que la anterior
    val mayor2 = if (a > b) a else b

    println(mayor2)

    /**
     * Condiciones con WHEN
     */
    var x = 9
    when(x){
        0,1 -> print("vale 0 o 1")
        in 2..10 -> print("Entre 2 y 10") //si esta en el rango de 2 a 10
        else -> print("Otro valor")
    }

    do{
        val y = 6
    }
    while(y > 0) //la variable se puede declarar dentro


    /**
     * Bucle FOR ( la variable dentro no le gusa, se declara fuera
     * si solo hay una orden se pueden prescindir de los {}
     */
    var i : Int

    //estaria haciendo de contador
    for(i in 1..5)
        print(i) //estaria haciendo de contador

    //contar descendiendo
    for(i in 10 downTo 0 step 2){
        println(i)
    }

    //parecido a un for Each, con una coleccion de datos
    for (letra in "hola") // no es imprescindible declarar la variable letra
        println(letra)


    /**
     * Ejeccicio --> di si un numero es par o impar, usando la sintaxis de if como expresion
     * en vez de la sintaxis clasica
     */
    var c : Int
    var d : Int



    
}