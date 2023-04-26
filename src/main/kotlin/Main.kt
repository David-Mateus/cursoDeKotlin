fun main(){
    // 1.copy so funciona com data class
    val userA = User1("David", true);

    //2. estrutura de dados simples
        //pair - 2
        //val coordenadas = Pair(10, "Tiago"); // o PAIR é um data class
        val usuarioPeloId = 10 to "David";
        println(usuarioPeloId.first)
        println(usuarioPeloId.second)
    //triple - 3
    val triple = Triple(200,100, 1);
    println(triple.first)
    println(triple.second)
    println(triple.third)
    // tudo posso



}


//Obs: Quando utilizar data class - manipular estrutura de dados
// O que importa é a declaração disso aqui
data class User1(var name: String, var isAdmin: Boolean);