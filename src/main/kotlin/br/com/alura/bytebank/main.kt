import br.com.alura.bytebank.modelo.Endereco

fun main() {
    testaWith()
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "01234-567"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}






