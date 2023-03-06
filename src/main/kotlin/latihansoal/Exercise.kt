package latihansoal

class Exercise  {
private var namaPembeli:String
private var judulBuku:String
private var jumlah:Int
private var harga:Int
private var uangBayar:Int


    public constructor(namaPembeli: String, judulBuku:String, jumlah :Int, harga:Int, uangBayar:Int) {
        this.namaPembeli = namaPembeli
        this.judulBuku = judulBuku
        this.jumlah= jumlah
        this.harga = harga
        this.uangBayar = uangBayar
    }

    fun kembalianUang():Int = this.uangBayar - hitungHarga()

    fun hitungHarga(): Int{
        val hitungHarga = this.harga * this.jumlah

        return when{
            hitungHarga > 300000 -> hitungHarga - 50000
            else -> hitungHarga
        }
    }


    private fun bonusPembelian(hitungHarga: Int): String{
        return when{
            hitungHarga in 150000..200000 -> "1 Buah Pena"
            hitungHarga in 200000..300000 -> "1 Buah Buku Catatan"
            hitungHarga > 300000 -> "Diskon Rp. 50000"
            else -> "0"
        }
    }

    public fun showData(){
        println("=================================")
        println("STRUK PEMBELIAN BUKU TOKO AND5")
        println("=================================")
        println("Nama Pembeli: ${this.namaPembeli.toUpperCase()}")
        println("Buku yang dibeli adalah : ${this.judulBuku}")
        println("Jumlah yang dibeli adalah : $jumlah")
        println("Total : Rp. ${hitungHarga()}")
        println("Kembali : ${kembalianUang()}")
        println("Bonus : ${bonusPembelian(hitungHarga())}")
        println("======================================")
        println("-------------TOKO BUKU AND5----------------")

    }

}