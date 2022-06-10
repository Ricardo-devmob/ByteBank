class SistemaInterno {

    fun autentica(login: FuncionarioAdmin, senha: Int){
        if (login.autentica(senha)){
            println("Bem vindo ao ByteBank")
        }else{
            println("Erro na autenticação")
        }
    }
}