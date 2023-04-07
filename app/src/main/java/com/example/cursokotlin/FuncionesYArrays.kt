package com.example.cursokotlin

fun main() {
    saludar()

    println(numeroDoble(5))
    println(numeroDoble2(5))
    println(numeroDoble3(5))
    println(potencia(5, 2))
    println(potencia(nBase = 2)) // damos solo el segundo parametro, podriamos dar el otro parametro,
    // o ponerlos en diferente orden siempre que indicasemos si es nExponenete o nBase
    println(potencia(nBase = 3, nExponente = 5))
    /**
     * Arrays ( mismo tipo)
     */

    //usaremos val para que no se pueda modificar su contenido
    val numeros = arrayOf("uno", "dos", "tres")

    for (numero in numeros)
        println(numero)

    //fomras de acceder a la posicion de un array
    println(numeros[1])
    println(numeros.get(1))

    //formas de modificar el contenido del array. Se puden modificar los elementos, pero no
    // el array como conjunto
    numeros[2] = "nuevo tres"
    numeros.set(
        1,
        "nuevo dos"
    ) //estamos diciendo que en el array numeros, en la posicion 1 se modificará por "nuevo dos"

    //para saber el tamaño
    println(numeros.size) //al ser una propiedad no necesita parentesis

    /**
     * array de valores nulos para luego ir dandoselos
     */

    val profesores: Array<String?> = arrayOfNulls(2)
    profesores[0] = "juan"
    profesores[1] = "pepe"

    /**
     * listas inmutables, una cosa que no se modifica será más rapida que otra que si lo sea
     */
    val listaNumeros: List<String> = listOf("uno", "dos", "tres")
    for (numero in listaNumeros)
        println(numero)

    println(listaNumeros.size)
    println(listaNumeros[1])
    println(listaNumeros.get(1))

    /**
     * Lista mutables
     */
    val listaNumerosMutables: MutableList<String> = mutableListOf("uno", "dos", "tres")
    for (numero in listaNumerosMutables)
        println(numero)

    println(listaNumerosMutables.size)
    println(listaNumerosMutables[1])
    println(listaNumerosMutables.get(1))
    //podemos además añadir datos al final o en posiciones intermedias
    listaNumerosMutables.add("cuatro")
    listaNumerosMutables.add(0, "Cero")

    //vamos a recorrer la lista de forma mas conpacta con un forEach

    listaNumerosMutables.forEach({ print(it + " ") }) //de mi liasta coge todos he imprime cada una de las iteraciones


    /**
     * MAPAS O DICCIONARIOS
     */
    val mapaMutable = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
    //acciones posibles:
    mapaMutable.put("cuatro", 4)
    mapaMutable["uno"] = 10

    //otra forma de escribirlo :
    val mapaMutable2 = mutableMapOf(
        Pair("uno", 1),
        Pair("dos", 2),
        Pair("tres", 3)
    )


    /**
     * conjunto sin clave valos pero ese valor no podrá tener repetidos
     */

    val conjunto = mutableSetOf<Int>() //le decimos que los elemento seran de tipo entero
    conjunto.add(1)
    conjunto.add(2)
    conjunto.add(3)
    conjunto.add(4)
    //el print para esto si esta definido y no s tendrias que salir los alores separados por comas
    println(conjunto)


}

/**
 * Forma de declarar una fincion
 */
fun saludar() {
    println("Hola")
}

/**
 * Funcion que recibe un dato de tipo Int y devuelve otro de tipo Int
 */
fun numeroDoble(x: Int): Int {
    return x * 2
}

//forma mas abreviada aun
fun numeroDoble2(x: Int): Int = x * 2

//mas
fun numeroDoble3(x: Int) = x * 2

/**
 * Podemos tener una funcion que necesita do variables, una puede tener un valor por defecto
 * y la otra no, así será el valor que reciba
 */
fun potencia(nExponente: Int = 1, nBase: Int): Int {
    return 5
}
