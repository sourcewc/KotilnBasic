fun main(args:Array<String>) {

    infix fun Int.times(str:String) = str.repeat(this)
    println(2 times "Bye")

    //Creates a Pair by calling the infix function to from the standard library.
    val pair = "Ferrari" to "Katrina"
    println(pair)

    //Here's your own implementation of to creatively called onto.
    infix fun String.onto(other:String) = Pair(this , other)
    val myPair = "McLAren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    //Infix notation also works on members functions (methods).
    sophia likes claudia
}
class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other:Person) { likedPeople.add(other)}
}