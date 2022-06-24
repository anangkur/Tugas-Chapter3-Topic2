class KrisnaSirait {
    fun askInfo(){
        print("Masukkan nama anda : ")
        val name: String? = readLine()
        print("Masukkan usia anda : ")
        var age:Int = readLine()?.toInt() ?: 0
        print("Masukkan usia adik anda : ")
        var ageBro: Int = readLine()?.toInt() ?: 0

        //Arithmatic
        val resultMod = (age?:0) % (ageBro?:0)
        val resultMul = (age?:0) * (ageBro?:0)
        val resultDiv = (age?:0) / (ageBro?:0)
        val resultALl = resultDiv * resultDiv / resultMod

        //String operator
        val resultGreetings  = "Nama saya " + name.toString() + ", Umur saya "+ age.toString() + ", Umur adik saya "+ ageBro

        //assigned operator
        ageBro += age

        //unary operator
        print("Apakah anda keluarga? ")
        val isFamily = readLine()?.toBoolean() ?: false
        val resUnary = !isFamily

//        println(name)
//        println(age)
//        println(resultMod)
//        println(resultMul)
//        println(resultDiv)
//        println(resultALl)
//        println(resultGreetings)
        println(resUnary)
    }


}

fun main(){
    val krisnaSirait = KrisnaSirait()

    krisnaSirait.askInfo()
}