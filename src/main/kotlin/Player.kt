class Player constructor(val name : String){
     fun touch() : String{
         return "$name, Play na musica!"
     }
    fun stop() : String{
        return "$name, musica parada"
    }
    fun nextMusic() : String{
        return "$name, Adiandando 5s"
    }
}