import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaSalario

fun testaComportamentosConta() {
    val contaAlex = ContaCorrente("Alex", 1000)
//    contaAlex.deposita(-200.0)
//
//    val contaFran = br.com.alura.bytebank.modelo.ContaPoupanca(numero = 1001, titular = "Fran")
//    contaFran.deposita(300.0)
//
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)
//
//    println(contaAlex.titular)
//    println(contaAlex.numero)
//    println(contaAlex.saldo)
//
//    println("depositando na conta do Alex")
//    contaAlex.deposita(50.0)
//    println(contaAlex.saldo)
//    println("depositando na conta da Fran")
//    contaFran.deposita(70.0)
//    println(contaFran.saldo)
//
//    println("sacando na conta do Alex")
//    contaAlex.saca(250.0)
//    println(contaAlex.saldo)
//
//    println("sacando na conta da Fran")
//    contaFran.saca(100.0)
//    println(contaFran.saldo)
//
//    println("saque em excesso na conta do Alex")
//    contaAlex.saca(100.0)
//    println(contaAlex.saldo)
//
//    println("saque em excesso na conta da Fran")
//    contaAlex.saca(500.0)
//    println(contaFran.saldo)
//
//    println("Transferencia da conta da Fran para o Alex")
//    if (contaFran.transfere(300.0, contaAlex)) {
//        println("Transferencia sucedida")
//    } else {
//        println("Falha na transferencia")
//    }
//    println(contaAlex.saldo)
//    println(contaFran.saldo)

    val contaSalario= ContaSalario(
        titular = "Gui",
        numero = 3000
    )

    contaSalario.deposita(500.0)
    println("saldo = ${contaSalario.saldo}")
    contaSalario.transfere(200.0, contaAlex)
    println("total de contas criadas: ${Conta.total}")

}