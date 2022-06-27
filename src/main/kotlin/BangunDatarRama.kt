fun main(args: Array<String>) {
    println("===============Hitung Luas Keliling Bangun Datar ==================")
    print("masukan panjang: ")
    val panjang: Int? = readLine()?.toInt() //membaca inputan user sebagai tipe data int bisa null.
    print("masukan lebar: ")
    val lebar: Int? = readLine()?.toInt()

    val bangunDatar = BangunDatar()
    val result = bangunDatar.hitungLuas(panjang, lebar)

    print("luas: ")
    print(result)

}


class BangunDatar() {
    //operator arithmetic perkalian
    fun hitungLuas(panjang: Int?, lebar: Int?): Int {
        val long = panjang ?: 0
        val width = lebar ?: 0
        return long * width
    }
}

