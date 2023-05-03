package OOP
//Classe Retângulo: Crie uma classe Retângulo com atributos como comprimento, largura, área, etc.
// Você pode adicionar métodos para calcular o perímetro ou para imprimir as informações do retângulo.
fun main(){
    val retangulo1 = Retangulo();
    retangulo1.altura = 10;
    retangulo1.areaBase = 10;
    println(retangulo1.areaDoPerimetro())
}
class Retangulo{
    var altura : Int = 0;
    var areaBase : Int = 0;

    fun areaDoPerimetro() :  Int{
        val calcu = areaBase * altura
        return calcu
    }
}