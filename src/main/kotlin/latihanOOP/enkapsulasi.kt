package latihanOOP

// Acces Modifier : Public, Private, Protected, Internal

open class Mahasiswa(){
    var name : String = "Riki"
    private var age : Int = 21 // akses hanya bisa di lakukan di class mahasiswa
    open protected var address : String = "Depok" // class dan sub class
    internal var nim : String = "1402020116" // kelas yang sama / world(1 project)

}

open class AndroidClass(): Mahasiswa(){
//    val andClass = Mahasiswa()
//    override var address: String
//        get() = super.address
//        set(value) {}

}

fun main() {
    val mhs = Mahasiswa()
    mhs.nim
    println("Nim : ${mhs.nim}")

    val fsw = FswClass()
    fsw.exPublic()
    fsw.exInternal()

}

class FswClass(){

    public fun exPublic(){

    }

    private fun exPrivate(){

    }

    protected fun exProtected(){

    }

    internal fun exInternal(){

    }
}

private class MyClass(){

}

internal class MyClass4(){

}