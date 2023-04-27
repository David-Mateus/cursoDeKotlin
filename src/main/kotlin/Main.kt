fun main(){
    // 2. abstract
    /// 2.1 - classe abstrada é uma classe criada para dá as suas propriedades
    /// as classes filhas, logo não hpa necessidade se ter uma instancia da superClasse
    /// Evitar instancviar da clase pai
    /// 2.2
}


abstract open class Pessoa(var name: String, var address: String){
    protected var acessoBilioteca = false
    fun description() = "Meu nome é : $name e meu endereço é $address, nivel de acesso : $acessoBilioteca";
}

// sem herança
class Professor(name: String, address: String) : Pessoa(name, address){
    init{
        acessoBilioteca = true
    }
}
class Aluno (var matriculaId: Int,  name: String,  address:String ) : Pessoa(name, address){

}