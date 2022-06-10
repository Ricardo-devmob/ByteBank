abstract class Conta(
    val titular: String,
    val numero: Int
): Transferivel {
    var saldo = 0.0
        protected set


    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

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