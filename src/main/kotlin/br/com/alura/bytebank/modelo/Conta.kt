package br.com.alura.bytebank.modelo

abstract class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set
    companion object{
        var total = 0
        private set
    }
    init {
        println("Criando conta")
        total++
    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }
    abstract fun podeTransferir(): Boolean
    abstract fun saca(valor: Double)

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (podeTransferir()) {
            if (saldo >= valor) {
                saldo -= valor
                contaDestino.deposita(valor)
                return true
            }
            return false
        }
        return false
    }
}