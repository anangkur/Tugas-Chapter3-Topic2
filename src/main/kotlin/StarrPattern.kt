fun main() {

    print("Masukkan x untuk menggambar : ")
    var i : Int = readLine()?.toInt() ?:0
//    pattern2(i)

    pattern2(i)

    pattern3(i)



}

fun pattern2(x: Int) {
    for (baris in 0 until x) {
        for (kolom in 0 until baris) {
            print("* ")
        }
        println()
    }
}

fun pattern3(x : Int) {
    var baris = 0
    var length = 1
    while (0 < x) {
        var kolom = 0
        while (kolom < length){
            print("* ")
            kolom++
        }
        println()
        baris++
        length++
    }
}

