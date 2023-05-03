package OOP

fun main(){
   //OOP - Programção orientada objetos
    val filme1 = Filme();
    filme1.titulo = "Homem aranha";
    filme1.descricao = "Wakanda Para Sempre é a continuação do longa Pantera";
    filme1.elenco = "N pessoas";
    println(filme1.upperTitulo())

}
class Filme{
    //Propriedades
    var titulo : String = "";
    var descricao : String = "";
    var elenco : String = "";

    // Metodos/comportamentos
    fun upperTitulo() : String {
        return titulo.uppercase()
    }
}