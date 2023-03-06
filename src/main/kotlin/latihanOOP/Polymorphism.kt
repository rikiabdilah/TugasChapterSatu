package latihanOOP

fun main() {

    val buah = Buah()
    buah.deskripsi("Apel")
}

class Buah(){

    // method overloading : function yang sama dalam 1 class, beda bentuk / tipe data

    fun deskripsi(name: String){
        println("nama buah : $name")

    }
    fun deskripsi(warna: String, vit: Char){

    }

}

// Method Overriding


