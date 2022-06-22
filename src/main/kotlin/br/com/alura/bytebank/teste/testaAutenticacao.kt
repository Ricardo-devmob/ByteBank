import br.com.alura.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000,
        Endereco()

    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0,
        Endereco()
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234,
        Endereco()
    )

    val sistema = SistemaInterno()
    sistema.autentica(gerente, 1000)
    sistema.autentica(diretora, 2000)
    sistema.autentica(cliente, 1234)
}