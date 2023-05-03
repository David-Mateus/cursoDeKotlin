package OOP

// Exercicis baseado na primeira aula que foi uma introdução sobre OOP
//Classe Círculo: Crie uma classe Círculo com atributos como raio, diâmetro, circunferência, etc.
// Você pode adicionar métodos para calcular a área ou para imprimir as informações do círculo.
fun main(){
   val userCiruclo = Circulo();
    userCiruclo.raio = 10.0;
    userCiruclo.areaCirculo();
}
class Circulo{
    var raio : Double = 0.0;
    fun areaCirculo(){
        val total = 3.14 * (raio*raio);
        println("Area do circulo: $total");
    }
}
