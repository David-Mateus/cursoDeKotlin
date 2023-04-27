//internal -> so é disponivel desse modulo. Restringir para pessoas de foras

internal class Encordoamento(val numeroDeCordas: Int, val marca : String);
open class Instrumento(var cor: String){

     private lateinit var encordoamento: Encordoamento

    fun console(){
        println("Esse instrumento é da cor $cor, numero de cordas : ${encordoamento.numeroDeCordas}, marca: ${encordoamento.marca}")
    }
    fun addEncodoamento(num:Int, marca :  String){
        encordoamento = Encordoamento(num, marca);
    }
}
class Guitarra(cor : String) : Instrumento(cor){
    init{
        addEncodoamento(6, "Nig")
    }
}