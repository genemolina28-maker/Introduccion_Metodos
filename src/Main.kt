//ivocación básica
fun saludar (){
    println("Bienvenidos a la programación funcional ")
}

//invocación en secuencia
fun iniciar(){
    println("Iniciando ")
}
fun procesar(){
    println("Procesando")
}
fun finalizar(){
    println("finalizando ")
}

//método con parámetros
fun imprimirNombre ( nombre : String, edad : Int){
    println("El nombre: $nombre y tiene $edad años")
}

fun calcularArea(base:Double, altura:Double){
    val area = (base*altura)/2
    println("El área del triángulo es: $area")
}

//métodos q retornar algo
fun sumar (uno:Int, dos: Int):Int{
    return uno + dos
}

fun sumar2 (a: Int, b: Int):Int = a+b

//metodo para ver si ese par
fun esPar( a:Int): Boolean = a%2==0

// calcular promedio de 3 estudiantes
fun calcularPromedio(a: Double, b: Double, c: Double): Double = (a+b+c)/3


class Calculadora {

    //funciones
    fun restar ( a: Int, b: Int): Int = a-b

}
class Persona (var nombre:String, var edad:Int){

    //funciones


}
fun main() {

    saludar ()

    iniciar()
    procesar()
    finalizar()

    imprimirNombre(" Gene", 23)

    calcularArea(25.0,2.0)

    //invocar a un método q retorna algo
     val resultado =sumar(5,3)
    //1
    println(resultado)
    // 2
    println(sumar(4,5))

    val resultado2 = sumar2(3,5)

    println(esPar(2))
    println(calcularPromedio(25.0,2.0,5.0))

    // invocar métodos de las clases
    val calculadora = Calculadora()
    calculadora.restar(5,3)

}