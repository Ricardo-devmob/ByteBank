class SistemaInterno {

    fun autentica(admin: Autenticavel, senha: Int){
        if (admin.autentica(senha)){
            println("Bem vindo ao ByteBank")
        }else{
            println("Erro na autenticação")
        }
    }
}