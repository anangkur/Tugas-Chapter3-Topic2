

fun main() {

    val declare = isLapar(true)

    println(declare)

    print("""
        Apa yang ingin anda minum?
        1. sprite
        2. coca cola
        3. air putih                
        Masukkan pilihan anda : 
    """.trimIndent())
    val isHaus : String? = readLine()?.trim()

    when ( isHaus ){                         // <-- penggunaan when lebih sering digunakan di lebih dari 2 desisi.
        "1" -> println("Aku mau minum sprite")
        "2" -> println("Aku mau minum coca cola")
        "3" -> println("Aku mau minum air putih")
    }

    ulangTerusRange()

    ulangTerusUntil()

    sampeBawah()

    forEachArray()

    nyobaWhile()

}

fun isLapar ( sayaLapar : Boolean) : String {  //<--secara praktisi 2 decision biasanya menggunakan if else
    return if (sayaLapar == true){
        "Saya makan"
    } else {
        "Saya kenyang"
    }
}

fun ulangTerusRange(){      //--> range = 6 nya tetep ikut karena kurang dari sama dengan
    for ( i in 0..6){
        print("$i, ")
    }
}

fun ulangTerusUntil(){      //--> range = 6 nya ngga ikut karena kurang dari
    for (i in 0 until 6){
        print("$i")
    }
}

fun sampeBawah(){
    for( i in 6 downTo 1){
        println("$i")
    }
}

fun forEachArray(){
    var a = arrayOf(1,2,3,4,5)

    for (b in a){
        println(b)
    }

    a.forEach { bilangan ->
        println(bilangan)
    }
}

fun nyobaWhile (){
    var i = 0
    while (i<6){
        println(i)
        i++
    }

    do {
        println(i)
        i++
    } while ( i< 6)
}