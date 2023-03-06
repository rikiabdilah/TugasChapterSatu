package latihansoal

fun main() {

    println("========================================================")
    println("INPUT TRANSAKSI PENJUALAN TOKO BUKU AND 5")
    println("========================================================")

    print("Nama Pembeli : ")
    val namaPembeli :String = readln().toString()
    print("Judul Buku : ")
    val judulBuku :String = readln().toString()
    print("Jumlah : ")
    val jumlah:Int = readln().toInt()
    print("Harga: ")
    val harga: Int = readln().toInt()
    print("Uang Bayar: ")
    val uangBayar: Int = readln().toInt()

    val pembayaran :Exercise = Exercise(namaPembeli, judulBuku,jumlah, harga, uangBayar)

    pembayaran.showData()
}
