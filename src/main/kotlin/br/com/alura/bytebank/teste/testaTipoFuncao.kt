package br.com.alura.bytebank.teste


fun testaFuncaiAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(20, 35))


    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1200.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        salario + 100.0
    }
    println(calculaBonificacao(1100.0))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(10, 10))
}

fun testeTipoFuncaoReferencia() {
//    val minhaFuncao = ::soma
//    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

fun teste() {
    println("executa teste")
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}