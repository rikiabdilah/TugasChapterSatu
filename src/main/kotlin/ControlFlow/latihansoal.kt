package ControlFlow

fun main(){
    // Nomor 1 & 2
    print(isOdd(3))
    getDiscount(100.0, 10.0)
}

fun isOdd(angka:Int): Boolean {
    return angka % 2 == 0

}

fun getDiscount(price: Double, discount: Double): Double {
    return if (price > 100 && discount > 10) {
        price * (10 - discount/100)
    } else {
        price
    }
}

