package ControlFlow

fun main() {

/*
    val angka : Int = 3
    val hasil = when(angka) {
        1 -> "Satu"
        2 -> "Dua"
        3 -> "Tiga"
        else -> "Tidak Ada"
    }
    println("Result is : $hasil")

// 4
    val hari : Int = 3
    val hitungHari : String = when(hari){
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        else -> "Libur"
    }
    println("Sekarang hari : $hitungHari")


    //5
    val number = 5

    when {
        number > 0 -> println("Positive")
        number < 0 -> println("Negative")
        else -> println("Zero")
    }
    println(number)


   // 6
    for (o in 1..10){
        print("$o")
        if (o < 10){
            print(", ")
        }
    }

    // 7
    for (bilanganGenap in 0..20 step 2){
        print("$bilanganGenap")
        if (bilanganGenap < 20){
            println(", ")
        }
    }

    //8
    for (menampilkanKarakter in 'A'..'Z'){
        print("$menampilkanKarakter")
        if (menampilkanKarakter < 'Z'){
            print(", ")
        }
    }
    // 9
    for (k in 10 downTo 1){
        print("$k")

    }



    // 10
    var bilanganGanjil = 0
    for (i in 1..100 step 2) {
        bilanganGanjil += i
    }
    println("Jumlah bilangan ganjil dari 1 hingga 100 adalah $bilanganGanjil")



    // 11
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    // 12
    val bintang = 4
    for (x in 0..bintang ){
        for ( m in 1..bintang - x){
            print(" ")
        }
        for (k in 1..2* x + 1){
            print("* ")
        }
        println()
    }













    // 13
    var i = 2
    while (i <= 20){
        println(i)
        i += 2
    }


    //14
    var x = 1
    while (x <= 50) {
        if (x % 2 != 0) {
            println(x)
        }
        x++
    }


    // 15
    var i = 1
    do {
        println(i)
        i += 2

    }while (i <= 20)

    // 16
    print("Masukkan Angka Positif : ")
    var insert = readLine()!!.toInt()

    var x = 1
    do {
        println(x)
        x++
    }while (x < insert)



    // 17
    var hitungGanjil = 0
    for (i in 1..50 step 2) {
        if (i > 25) {
            break
        }
        hitungGanjil++
    }
    println("Jumlah bilangan ganjil antara 1 dan 25 adalah $hitungGanjil")

    // 18
    var count = 0
    for (x in 2..50 step 2) {
        if (x > 25) {
            break
        }
        count++
    }
    println("Jumlah bilangan genap antara 2 dan 25 adalah $count")

 */

    // 19
    val array = intArrayOf(5, 3, 7, 9, 6, 2)
    var result = 0
    for (num in array) {
        if (num % 3 == 0) {
            result = num
            break
        }
    }
    if (result == 0) {
        println("Tidak ada bilangan dalam array yang habis dibagi 3")
    } else {
        println("Bilangan pertama dalam array yang habis dibagi 3 adalah $result")
    }

    // 3
    fun calculateGrade(score: Int): String {
        return when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
    }


 }

