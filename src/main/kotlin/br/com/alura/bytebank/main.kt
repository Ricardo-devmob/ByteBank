import br.com.alura.bytebank.modelo.Endereco

fun main() {


    val endereco = Endereco(cep = "00000-000", logradouro = "rua 10")
    val enderecoNovo = Endereco(logradouro = "Rua da paz", numero = 12, cep = "00000-000")

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    testaComportamentosConta()
}










