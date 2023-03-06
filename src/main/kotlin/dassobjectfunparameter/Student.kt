package dassobjectfunparameter

// function yang ditambahkan ke suatu class

class Student (var name: String, var umur : Int, var nim: String)

fun dataNilai(){

}

fun profile(){

}

//fun isAdult(umur: Int): Boolean{
//    return umur >= 18
//}
fun Student.isAdult():Boolean{
    return umur >= 18
}

fun main() {
    val student1 = Student("Riki", 18, "1402020116")
    println(student1.isAdult())
}