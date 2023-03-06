// Kelas yang bertanggung jawab menghitung luas lingkaran
class Circle(val radius: Double) {
    fun area() = Math.PI * radius * radius
}

// Kelas yang bertanggung jawab mencetak informasi lingkaran
class CirclePrinter(val circle: Circle) {
    fun print() {
        println("Lingkaran dengan radius ${circle.radius} memiliki luas ${circle.area()}")
    }
}

// Program utama
fun main() {
    // Membuat objek Circle dan CirclePrinter
    val circle = Circle(5.0)
    val circlePrinter = CirclePrinter(circle)

    // Mencetak informasi lingkaran
    circlePrinter.print()
}



