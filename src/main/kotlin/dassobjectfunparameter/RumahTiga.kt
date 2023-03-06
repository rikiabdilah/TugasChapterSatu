package dassobjectfunparameter

class RumahTiga {
    var panjangRumah : Int = 100
    var lebarRumah : Int = 50
    var luasTanah : Int = 100
    var namaPemilik: String = "Riki"
    var warnaRumah: String = "Hijau"

    constructor(_panjangRumah : Int, _lebarRumah: Int, _namaPemilik:String){
        this.panjangRumah = _panjangRumah
        this.lebarRumah = _lebarRumah
        this.namaPemilik = _namaPemilik
    }

    constructor(_luasTanah : Int, _warnaRumah : String){
        this.warnaRumah = _warnaRumah
        this.luasTanah = _luasTanah
    }

    fun hidupkanLampu():String{
        return "Rumah bisa menghidupkan lampu"
    }

    fun naikTurunLift():String{
        return "Bisa naik turun menggunakan lift"
    }

    fun tahanPanas():String{
        return "Rumahnya tahan panas"
    }
}