fun main() {

    print("Masukkan x untuk menggambar : ")
    var i : Int = readLine()?.toInt() ?:0

    pattern4(i)
    println()
    pattern5(i)



}

fun pattern2(x: Int) {
    for (baris in 0 until x) {
        for (kolom in 0 until baris) {
            print("* ")
        }
        println()
    }
}


fun pattern4(x : Int) {
    for (baris in 0..2*x){
        val totalSpace = if (baris < x) x - baris else baris - x
        val totalKolom = if (baris < x) baris else (2*x) - baris
        for (space in 0 until  totalSpace){
            print(" ")
        }
        for (kolom in 0 until totalKolom){
            print("* ")
        }
        println()
    }
}

fun pattern5(x : Int){
    var baris = 0
    while (baris<2*x){
        var space = 0
        var kolom = 0
        var totalSpace = if (baris < x) x - baris else baris - x
        var totalKolom = if (baris < x) baris else (2*x) - baris
        baris++
        while (space < totalSpace ){
            print(" ")
            space++
        }

        while (kolom<totalKolom){
            print("* ")
            kolom++
        }
        println()
    }

}



