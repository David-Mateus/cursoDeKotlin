class Calculator constructor(val number1 : Int, val number2 : Int){
    
    companion object{
        //const COMPILACAO
        const  val MAX_NAME_LENGHT = 8; // Padrão upper_case | Constante
    }

    init {

    }

    fun multiplication () : Int{
        return number1 * number2;
    }
    fun sum () : Int{
        return number1 + number2;
    }
    fun subtraction () : Int{
        return number1 - number2;
    }
    fun division () : Int{
        return number1 / number2;
    }

}