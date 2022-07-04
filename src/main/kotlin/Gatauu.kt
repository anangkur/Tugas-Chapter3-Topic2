//superclass
open class Gatauu {
    open fun penilaian(): IntRange {
        val rating: IntRange = 1..5
        println("Masukkan rating untuk game ini : ")
        return 1..5
    }
}
//subclass
class ntahdah: Gatauu() {
    override fun penilaian(): IntRange {
        println("Masukkan rating untuk game ini antara 1 sampai 5: ")
        return (1..5)
    }

}