
fun main() {
    calculadora()
}

fun soma(n1: Double, n2: Double): Double{
    return n1 + n2
}

fun subtracao(n1: Double, n2: Double): Double{
    return n1 - n2
}

fun multiplicacao(n1: Double, n2: Double): Double{
    return n1 * n2
}

fun divisao(n1: Double, n2: Double): Double{
    return n1 / n2
}

fun raizQuadrada(num: Double): Double{
    return kotlin.math.sqrt(num)
}

fun calculadora(){
    println("Escolha a operação que deseja fazer? ( 1 - Soma / 2 - Subtração / 3 - Multiplicação / 4 - Divisão / 5 - Raiz Quadrada ) ")
    val escolha = readln().toInt()

    if(escolha == 1){
        print("Digite o primeiro numero: ")
        val n1 = readln().toDouble()

        print("Digite o segundo numero: ")
        val n2 = readln().toDouble()

        println("$n1 + $n2 = ${soma(n1, n2)}")
        println("******************************************************")
        println("Digite 1 - Para fazer outra operação / 2 - Para sair!")
        val resp = readln().toInt()
        if(resp == 1){
            calculadora()
        }
    }

    if(escolha == 2){
        print("Digite o primeiro numero: ")
        val n1 = readln().toDouble()

        print("Digite o segundo numero: ")
        val n2 = readln().toDouble()

        println("$n1 - $n2 = ${subtracao(n1, n2)}")
        println("******************************************************")
        println("Digite 1 - Para fazer outra operação / 2 - Para sair!")
        val resp = readln().toInt()
        if(resp == 1){
            calculadora()
        }
    }

    if(escolha == 3){
        print("Digite o primeiro numero: ")
        val n1 = readln().toDouble()

        print("Digite o segundo numero: ")
        val n2 = readln().toDouble()

        println("$n1 x $n2 = ${multiplicacao(n1, n2)}")
        println("******************************************************")
        println("Digite 1 - Para fazer outra operação / 2 - Para sair!")
        val resp = readln().toInt()
        if(resp == 1){
            calculadora()
        }
    }

    if(escolha == 4){
        print("Digite o primeiro numero: ")
        val n1 = readln().toDouble()

        print("Digite o segundo numero: ")
        val n2 = readln().toDouble()

        println("$n1 / $n2 = ${divisao(n1, n2)}")
        println("******************************************************")
        println("Digite 1 - Para fazer outra operação / 2 - Para sair!")
        val resp = readln().toInt()
        if(resp == 1){
            calculadora()
        }
    }

    if(escolha == 5){
        print("Digite o numero que deseja saber a raiz quadrada: ")
        val num = readln().toDouble()

        println("A raiz de $num é ${raizQuadrada(num)}")
        println("******************************************************")
        println("Digite 1 - Para fazer outra operação / 2 - Para sair!")
        val resp = readln().toInt()
        if(resp == 1){
            calculadora()
        }
    }

}
