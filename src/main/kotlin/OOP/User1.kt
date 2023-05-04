package OOP
// Opeção 1 - Usar nome constructor + variavel e o valor por default
    //User1 constructor(var name : String = "")
// Opeção 2
    //Não passar um valor como default
    //User1 constructor(var name : String)
//Opeção 3
    //Não usar a palavra constrctor
    //User1(var name : String)

class User1(var name : String, var isAdmin : Boolean) {
        // Muito bom para inicializar coisa entre um constructor e outro

        lateinit var lastName: String

        companion object{ //propriedades e metodos da classe
            //const se usa para tempo de compilação
            const val MAX_NAME_LENGHT = 8; // padrao uppercase

        }
        init {
            println(MAX_NAME_LENGHT)
        }

        constructor(name:String) : this(name, false){
            println("Execute o construtor 2")
        }
        constructor() : this("Desconhecido"){
            println("Execute o construtor 3")
        }
        fun updateName(name : String){
            this.name = name;
        }
    fun outPut(){
        println("$name $lastName $isAdmin ")
    }
        fun printUpperCase(){
            println("Olá " + name.uppercase())
        }

        fun getNameLength() : Int{
            return name.length;
        }
}