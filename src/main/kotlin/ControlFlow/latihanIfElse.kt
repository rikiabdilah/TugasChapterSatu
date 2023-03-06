package ControlFlow

fun main() {

}

fun hitungScore(){
    print("Masukkan Nilai Mahasiswa : ")
    val inputScore : Int = readLine()!!.toInt()

    if(inputScore > 50){
        println("Lulus")
    }else if (inputScore <= 50){
        println("Tidak Lulus")
    }else{
        println("Tidak ada Nilai")
    }


}