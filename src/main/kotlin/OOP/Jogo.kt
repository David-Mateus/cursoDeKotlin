package OOP
fun main(){
    val jogo = Jogo();
    jogo.incremento(10)
    jogo.incremento(10)
    jogo.incremento(10)
    jogo.decremento()
    jogo.decremento()
    println(jogo.valorNoMomento())
}
class Jogo{
    private var count : Int =  0;

    fun incremento(data : Int){
        count+=data;
    }
    fun decremento(){
        count-=1;
    }
    fun valorNoMomento() : Int{
        return count;
    }
}