fun main(args: Array<String>) {
   /* // 1 = Deklarasi variabel “nama “  bertipe data String dan memasukkan nilai  "John Doe"
    val nama : String
    nama = "John Doe"

    println(nama)

    // 2 = Deklarasi variabel umur bertipe data Int dan memasukkan nilai 25
    val umur : Int
    umur = 25

    println(umur)
    // 3 = Deklarasi variabel gaji bertipe data Double dan memasukkan nilai 5000.0
    val gaji : Double
    gaji = 5000.0

    println(gaji)
    // 4 = Deklarasi variabel status bertipe data Boolean dan memasukkan nilai true
    val status : Boolean
    status = true

    println(status)
    // 5 Deklarasi variabel nilai bertipe data Float dan memasukkan nilai 7.5f
    val nilai : Float
    nilai = 7.5f

    println(nilai)
    // 6 Deklarasi variabel angka1 bertipe data Long dan memasukkan nilai 123456789L
    val angka1 : Long
    angka1 = 123456789L

    println(angka1)
    // 7 Deklarasi variabel angka2 bertipe data Short dan memasukkan nilai 100
    val angka2 : Short
    angka2 = 100

    println(angka2)
    // 8 Deklarasi variabel huruf bertipe data Char dan memasukkan nilai 'A'
    val huruf : Char
    huruf = 'A'

    println(huruf)
    // 9 Deklarasi variabel nilaiString bertipe data String dan memasukkan nilai "10"
    val nilaiString : String
    nilaiString = "10"

    println(nilaiString)
    // 10 Deklarasi variabel angka3 bertipe data Byte dan memasukkan nilai 25
    val angka3 : Byte
    angka3 = 25

    println(angka3)
    // 11 Deklarasi array angka bertipe data IntArray dan memasukkan nilai [1, 2, 3, 4, 5]
    val angka = intArrayOf(1, 2, 3, 4, 5)

    println(angka.contentToString())
    // 12 Deklarasi array huruf bertipe data CharArray dan memasukkan nilai ['a', 'b', 'c', 'd', 'e']
    val huruf = charArrayOf('a', 'b', 'c', 'd', 'e')

    println(huruf.contentToString())
    // 13 Deklarasi array nilai bertipe data DoubleArray dan memasukkan nilai [3.5, 4.0, 2.5, 3.0]
    val nilai = doubleArrayOf(3.5, 4.0, 2.5, 3.0)

    println("Nilai: ${nilai.contentToString()}")
    // 14 Deklarasi array nama bertipe data Array<String> dan memasukkan nilai ["John", "Doe", "Jane", "Doe"]
    val nama = arrayOf("John", "Doe", "Jane", "Doe")

    println(nama.contentToString())
    // 15 Deklarasi array bulan bertipe data Array<String> dengan ukuran 12 dan memasukkan nilai ["Januari",
    // "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"]
    val bulan = arrayOfNulls<String>(12)
    bulan[0] = "Januari"
    bulan[1] = "Februari"
    bulan[2] = "Maret"
    bulan[3] = "April"
    bulan[4] = "Mei"
    bulan[5] = "Juni"
    bulan[6] = "Juli"
    bulan[7] = "Agustus"
    bulan[8] = "September"
    bulan[9] = "Oktober"
    bulan[10] = "November"
    bulan[11] = "Desember"

    println(bulan.contentToString())
    // 16 Deklarasi array nilaiFloat bertipe data FloatArray dan memasukkan nilai [2.5f, 3.0f, 2.0f]
    val nilaiFloat = floatArrayOf(2.5f, 3.0f, 2.0f)

    println(nilaiFloat.contentToString())
    // 17 Deklarasi list angka dengan tipe data List<Int> dan memasukkan nilai [1, 2, 3, 4, 5]
    val angka = listOf<Int>(1, 2, 3, 4, 5)

    println(angka)
    // 18 Deklarasi list huruf dengan tipe data List<Char> dan memasukkan nilai ['a', 'b', 'c', 'd', 'e']
    val huruf = listOf<Char>('a', 'b', 'c', 'd', 'e')

    println(huruf)
    // 19 Deklarasi list nilai dengan tipe data List<Double> dan memasukkan nilai [3.5, 4.0, 2.5, 3.0]
    val nilai = listOf<Double>(3.5, 4.0, 2.5, 3.0)

    println(nilai)
    // 20 Deklarasi list nama dengan tipe data List<String> dan memasukkan nilai ["John", "Doe", "Jane", "Doe"]
    val nama = listOf<String>("John", "Doe", "Jane", "Doe")

    println(nama)
    // 21 Deklarasi list bulan dengan tipe data List<String> dan memasukkan nilai ["Januari", "Februari",
    // "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"]
    val bulan = listOf<String>("Januari", "Februari", "Maret", "April",
        "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")

    println(bulan)
    // 22 Deklarasi list nilaiFloat dengan tipe data List<Float> dan memasukkan nilai [2.5f, 3.0f, 2.0f]
    val nilaiFloat = listOf<Float>(2.5f, 3.0f, 2.0f)

    println(nilaiFloat)
    // 23 Mengubah nilai pada indeks tertentu dalam list angka menjadi nilai 10 , list data : (1, 2, 3, 4, 5)

    val angka = mutableListOf<Int>(1, 2, 3, 4, 5)
    val gantiAngka = 0
    angka[gantiAngka] = 10

    println(angka)
    // 24 Mengubah nilai pada indeks tertentu dalam list huruf menjadi nilai 'f', list data : ('a', 'b', 'c', 'd', 'e')

    val hurufList = mutableListOf<Char>('a', 'b', 'c', 'd', 'e')
    val ubahHuruf = 1

    hurufList[ubahHuruf] = 'f'

    println(hurufList)
    // 25 Menambahkan nilai baru ke dalam list nilai, list data : nilai = (3.5, 4.0, 2.5, 3.0)
    val  nilai = mutableListOf<Double>(3.5, 4.0, 2.5, 3.0)
    nilai.add(4 , 10.0)

    println(nilai)
    // 26 Menghapus nilai pada indeks tertentu dalam list nama, list data : nama =  ("John", "Doe", "Jane", "Doe")
    val hapusNama = mutableListOf<String>("John", "Doe", "Jane", "Doe")

    hapusNama.removeAt(1)

    println(hapusNama)
    // 27 Menyalin nilai dari list bulan ke list bulanBaru dan menambahkan nilai 'Januari' ke list bulanBaru, list data : bulan = ("Januari", "Februari",
    // "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")
    val bulan = mutableListOf<String>("Januari", "Februari", "Maret", "April", "Mei",
        "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")

    val bulanBaru = bulan.toMutableList()
    bulanBaru.add(0 , "Januari")

    println(bulanBaru)

    */



}