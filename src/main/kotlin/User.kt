class User constructor(var name:String, var isAdmin: Boolean) {
    // ter a certeza que a varaivel não vai ser nulla e sera inicalizada;
    //  inicialização tardia - so pode ser em class e nullable
     lateinit var lastName: String;
    constructor(name: String) : this(name, false){
    println("executei construtor - 2")
    }
    fun lastName(){
        println(lastName)
    }
    fun printUpperCase(){
        println("Olá " + name.uppercase());
    }
    fun updateName(newName: String){
        name = "$newName"
    }
    fun getNameLength() : Int {
        return name.length;
    }
}