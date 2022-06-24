class KrisnaSirait {
    fun askInfo(){
        print("Masukkan nama anda : ")
        val name: String? = readLine()
        print("Masukkan usia anda : ")
        val age:Int? = readLine()?.toInt()
    }


}

fun main(){
    val krisnaSirait = KrisnaSirait()

    krisnaSirait.askInfo()
}