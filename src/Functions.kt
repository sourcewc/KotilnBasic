
//A simple function that takes a parameter of type String and returns Unit (i.e., no return value).
fun functionExample(message : String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String= "Info") {
    println("[$prefix] $message");
}

fun multiply(x:Int,y:Int) = x*y

fun sum(x:Int,y:Int) : Int {
    return x+y
}
fun main(args:Array<String>) {

    functionExample("test");
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "KK",message = "Good")

    multiply(1,2)


}