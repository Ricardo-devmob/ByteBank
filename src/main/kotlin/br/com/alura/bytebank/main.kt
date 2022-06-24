import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Avenida um", complemento = "casa")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não deve ser vazio")
        println(tamanhoComplemento)
    }
    teste("")
    teste(1)
}



fun teste(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}
