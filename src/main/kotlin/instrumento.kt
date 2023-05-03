//internal -> so é disponivel desse modulo. Restringir para pessoas de foras


// class vó
abstract class Instrumento(var nome: String){
    // assinatura da função é a mesma
    // so que o comportamento de afinar é diferente
    abstract fun afinar()
    fun tocar(){

    }

}
// class mae
abstract class  InstrumentoDeCorda(nome: String, var cordas : Int) : Instrumento(nome){
    // não é obrigada a implemntar/difinir o comportamento da assinatura da funçao abstract
}
//classes filhas
class Guitarra(nome : String) :InstrumentoDeCorda(nome, 6) {
    override  fun afinar(){
        println("AFINAA EM MI")
    }
}
class Violino(nome:String): InstrumentoDeCorda(nome, 4){
    override fun afinar() {
        TODO("Not yet implemented")
    }
}
class Flauta(nome:String) : Instrumento(nome){
    override fun afinar(){
        println("Afinada em DÓ")
    }
}