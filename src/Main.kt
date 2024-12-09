fun main() {
    // Es obligatorio definir la función "main" para que cualquier IDE pueda correr el código.
    mostrar()
    tipos()
    variables()
    operadores()
    // ifElse()
    usoWhen()
}
fun mostrar() {
    print("Hola")
    println("Hola")
}

fun tipos() {
    var variable1: Int = 1 // Iterable
    var variable2: String = "hola" // String
    var variable3: Float = 1.0F // Float
    var variable4: Double = 1.0 // Double
    var variable5: Boolean = true // Boolean/Bool
    var variable6 = listOf(1,2) // List
    var variable7: Char = 'A' // Character/Char ( Abecedario )

    var variableNull: String? // Se le añade un "?" al especificar el tipo si puede llegar a ser NULL
}

fun variables() {
    var variable = "variable"   // Las variables son capaces de cambiar de valor y tipo si no se le indica.
    val valor = "valor" // Las value no son capaces de cambiar ni de valor ni de tipo.

    variable = "cambiada variable"
    // valor = "cambiado valor" // (Error)
}

fun operadores() {
    val operador1 = 2
    val operador2 = 2
    var total = 0
    /*
    Existen varios operadores:

    ( + ) Sumar
    ( - ) Restar
    ( * ) Multiplicar
    ( / ) Dividir
    ( % ) Entero de división
    ( ++ ) Incremento
    ( -- ) Decremento
    */
    // total = operador1 + operador2 // Suma normal
}

fun ifElse() {
    val pruebaif1: Int = 2
    val pruebaif2: Int = 1

    if (pruebaif2 > pruebaif1) {
        print("$pruebaif2 es mayor que $pruebaif1")
    } else {
        print("$pruebaif1 es mayor que $pruebaif2")
    }

    /*
    Estan estos tipos de comparaciones en los If>Else:

    Less than: a < b
    Less than or equal to: a <= b
    Greater than: a > b
    Greater than or equal to: a >= b
    Equal to a == b
    Not Equal to: a != b
     */
}

fun usoWhen() {
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    // El when recorre una cadena la cual se selecciona dependiendo en lo que le pongas en el "WHEN".
    // Es parecido como al usar un indice en una lista y poner "list[day]".
    println(result)
}

fun usoWhile() {
    var numwhile = 0
    var numbreak = 0

    // Mientras "numwhile" sea menor que 5 continuara la cadena
    while (numwhile < 5) {
        numwhile++ // "numwhile" aumenta +1 cada véz que hace la cadena.
        print(numwhile)
    }

    while (true) {
        // Esto es un bucle infinito hasta que se use un "break"
        numbreak++

        // Si el "numbreak" llega a 5 el bucle se parara.
        if (numbreak == 5) {
            break
        }
    }
}

fun usoFor() {
    val coches = listOf("Volvo", "BMW", "Ford", "Mazda")

    // Recorre la lista de "coches" siendo "x" el elemento actual de cada pasada en el bucle.
    for (x in coches) {
        println(x)
    }
}

fun usoArray() {
    // Se puede crear un array desde una variable o desde un for como en "usoFor()"
    // Al ser un array debe de ser "val" al declarar la variable.
    val coches = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    print(coches[2]) // Imprimira: "Ford" ya que el recorrido empieza desde 0 > 1 > 2 > 3.
}

fun usoRanges() {
    // El uso del ".." entre 2 valores, indicando el primero hasta el segundo.
    for (num in 5..10) { // En este caso recorrera desde el 5 hasta el 10. Serian: 6,7,8,9 .
        print(num)
    }
}

fun usoClases() {
    //Nunca crear una clase dentro de una función a menos que sea algo extremadamente especifico.
    class Coche {
        var ruedas = 0
        var modelo = ""
        var matricula = ""
    }

    // Para definirlos individualmente.
    var c = Coche()

    c.ruedas = 4
    c.modelo = "Ford"
    c.matricula = "2783 KDL"

    // En conjunto. ( Se debe de añadir en los parametros de la clase. )
    class Coche2(var ruedas: Int, var modelo: String, var matricula: String)

    val coche = Coche2(4, "Ford", "Mustang")
    print(coche)
}



