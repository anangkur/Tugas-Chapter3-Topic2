fun main() {

    try {
        print("masukkan bilangan pertama : ")
        var a : Int = readLine()?.toInt() ?: 0

        print("masukkan bilangan kedua : ")
        var b : Int = readLine()?.toInt() ?: 0

        var operasi = readLine()  ?: ""

        var hasil = calculator(a,b,operasi)

        println(hasil)
    } catch (e : NumberFormatException){
        println("Masukkan nilai yg benar")
    }

}

fun calculator (param1 : Int , param2 : Int , operasi : String ) : Int{
    return if (operasi == "+"){
        param1 + param2
    } else if ( operasi == "-" ){
        param1 - param2
    } else if ( operasi == "*" ){
        param1 - param2
    } else if ( operasi == "/" ){
        param1 - param2
    } else {
        -1
    }
}