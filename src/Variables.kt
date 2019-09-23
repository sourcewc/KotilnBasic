fun main(args: Array<String>) {
    var a: String = "initial"
    println(a)
    var b: Int = 1
    var c = 3
    fun someCondition() = true

    var d: Int
    if (someCondition()) {
        d=1
    } else {
        d = 2
    }
    println(d)
}