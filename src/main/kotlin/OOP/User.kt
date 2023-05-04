package OOP

fun main(){
// Propriedades e comportamentos da classe
    val userA = User1("David")
    val userB = User1("David2")
    val userC = User1("David")
    println(Database.name)
    println(Database.userLogot?.name)
    login(userA)
    login(userB)
    println(Database.userLogot?.name)
    userA.lastName = "Mateus"
    userA.outPut()
}
fun login(user:User1){
    Database.userLogot = user
}