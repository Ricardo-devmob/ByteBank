package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
import java.util.*

fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase(Locale.getDefault())
//    println(enderecoEmMaiusculo)

    val endereco = Endereco()
        .also { println("Criando endereco") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".uppercase(Locale.getDefault())
    }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}