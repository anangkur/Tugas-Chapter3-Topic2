

fun main() {
    print("masukkan nama depan anda : ")
    val nameDepan : String? = readLine()
    print("masukkan nama akhir anda : ")
    val namaAkhir : String? = readLine()

    print("masukkan umur anda : ")
    var umur : Int = readLine()?.toInt() ?: 0
    print("masukkan umur adik anda : ")
    var umurAdik : Int = readLine()?.toInt() ?: 0

    val namaDepanBelakang = nameDepan+namaAkhir
    println("Nama Lengkap adalah : $namaDepanBelakang")

    umur += umurAdik
    umur -= umurAdik
    umur /= umurAdik
    umur *= umurAdik


    println("Umurku : $umur")
    val hasilPerkalian =  (umur ?: 0) * (umurAdik ?: 0)
    val hasilPembagian =  (umur ?: 0) / (umurAdik ?: 0)
    val hasilTambah =  (umur ?: 0) + (umurAdik ?: 0)
    val hasilPengurangan =  (umur ?: 0) - (umurAdik ?: 0)
    val hasilModulo =  (umur ?: 0) % (umurAdik ?: 0)

    println("Hasil Perkalian umur : $hasilPerkalian")
    println("Hasil Pembagian umur : $hasilPembagian")
    println("Hasil Penambahan umur : $hasilTambah")
    println("Hasil Pengurangan umur : $hasilPengurangan")
    println("Hasil Modulo umur : $hasilModulo")


    println(tambahUmur(age2 = 40 , age1 = 10))

    nyobaUmurVararg(1,2,3,4,5,6)


}

fun tambahUmur ( age1 : Int , age2 : Int ) : Int {
    return  age1 + age2
}

fun tambahUmurTanpaReturn ( age1: Int , age2 : Int){ // <--- ini sebenernya tetep ngereturn Unit
    println(age1 + age2)
}

// single expression ----> return bisa digantikan dengan sama dengan (=), tipe kembalian bisa tidak di deklarasi
fun tambahUmurExpression(age1 : Int , age2 : Int) = age1 + age2

//parameter bisa dimasukkan nilai default
fun tambahUmurPakeParamDefault( age1: Int = 10 , age2: Int = 5) : Int{
    return age1 + age2
}

fun nyobaUmurVararg ( vararg banyakUmur : Int) { //   <--sama dengan arrayOfInteger
    banyakUmur.forEach { value
        -> print(value)
    }
}

class User(){
    fun cekNama(){ // <-- ini adalah member function, yaitu function yang ada di dalam class. jadi bukan top level funtion

    }
}