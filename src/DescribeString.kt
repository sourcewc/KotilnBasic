fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0 ) {
        return  "String of length ${maybeString.length}"
    } else {
        return "Empty or null String"
    }
}
fun main(args:Array<String>) {
    println(describeString(null))
}