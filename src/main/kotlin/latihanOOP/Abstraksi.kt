package latihanOOP

abstract class Dosen(){
    abstract fun namaDosen()
    fun jumlahMatkulAjar(){
        println("jumlah matkul yang diajar : 2")

    }
}

class Matkul():Dosen(){
    override fun namaDosen() {
        println("Nama Dosen: Elan")
    }


}

fun main() {
    // val dosen = Dosen()
    val matkul = Matkul()
    matkul.namaDosen()
    matkul.jumlahMatkulAjar()


}