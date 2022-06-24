fun main(args: Array<String>) {
    println("===============Kalkulator==Terminal==================")
    print("Masukan angka pertama: ")
    val angka1 = readLine()!!.toInt()
    print("Masukan angka kedua: ")
    val angka2 = readLine()!!.toInt()
    val ramaCalculator = RamaCalculator(angka1, angka2)
    print("Masukan aksi operasi - Tambah(a), Kurang(b), Perkalian(c), Pembagian(d): ")
    val operasi = readLine()!!.toString()
    val result = ramaCalculator.calculate(operasi)
    println("Hasilnya adalah $result")
}

class RamaCalculator(val angka1: Int, val angka2: Int) {
    val perkalian: Int
        get() = this.angka1 * this.angka2

    val pembagian: Int
        get() = this.angka1 / this.angka2

    val penambahan: Int
        get() = this.angka1 + this.angka2

    val pengurangan: Int
        get() = this.angka1 - this.angka2

    fun calculate(operator: String): String {
        val hasil: Int
        when (operator) {
            "a" -> {
                hasil = penambahan
            }
            "b" -> {
                hasil = pengurangan
            }
            "c" -> {
                hasil = perkalian
            }
            "d" -> {
                hasil = pembagian
            }
            else -> {
                return "Operasi tidak ditemukan"
            }
        }
        return hasil.toString()
    }

}



