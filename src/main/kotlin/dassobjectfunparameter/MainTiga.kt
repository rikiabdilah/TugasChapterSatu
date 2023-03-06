package dassobjectfunparameter

fun main() {
    /*
    val rumahA = Rumah()
    println("Nama Pemilik Rumah : ${rumahA.namaPemilik}" )
    println("Fungsi Rumahnya : ${rumahA.tahanPanas()}")
    println("Warna Rumah : ${rumahA.warnaRumah}")

    val ayamBetina = Hewan()
    println("Nama : ${ayamBetina.namaHewan}")

 */
    // secondary constructor

    val rumahD = RumahTiga(100, 80, "Riki")
    val rumahE = RumahTiga(150, "Kuning")

    // function

    contohLambdaFun()
    val sum = {a :Int, b: Int -> a+b}
    val sub = {a : Int, b : Int -> a-b}

    val hitungSum = calculate(12, 14, sum)
    val hitungSub = calculate(24, 11, sub)

    println("Hasil Penjumlahan : $hitungSum")
    println("Hasil Pengurangan : $hitungSub")
}
    fun calculate (a : Int, b : Int, operation:(Int, Int) -> Int):Int{
        return operation(a,b)

    }


fun contohLambdaFun(){
    // Lambda expression/anonymous funnc
    val ucapanUltah = {name : String -> "Happy Birthday $name"}
    val ucapan1 = ucapanUltah("Riki")
    println(ucapan1)
}

fun higherOrderFun(){
    //Higher Order Function : Function yang ada di dalam parameter function

}


