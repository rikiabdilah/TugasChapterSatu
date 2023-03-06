package latihanOOP

open class Animal{
    open fun deskripsi() {
        println("Deskripsi hewan ")
    }

    open fun namaAnimal(nama : String){
        println("nama binatang : $nama")
    }
}

public open class Harimau(): Animal(){
    override fun deskripsi() {
        super.deskripsi()
    }
    fun warnaKulit(){

    }

    fun warnaKulit(a: String){

    }

    // Overriding : Mengganti method / property
    //

    override fun namaAnimal(nama: String) {
        super.namaAnimal(nama)
    }

}

class Gajah(): Animal(){
    override fun namaAnimal(nama: String) {
        super.namaAnimal(nama)
    }

}

class HarimauSumatera(): Harimau() {
    override fun deskripsi() {
        super.deskripsi()
    }

}