class AffanZanuar {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            var a = intArrayOf(1,2,3,4,5)

            var b = jumlahArray(a)

            println(b)

        }

        fun jumlahArray(dataArray : IntArray) : Int{
            var j = 0;
            for ( i in dataArray){
                j+=i
            }
            return j
        }


    }
}