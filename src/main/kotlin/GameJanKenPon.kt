import kotlin.system.exitProcess

private fun main() {
    println("Selamat Datang di Game JanKenPon >>>>>>>>>>>>>>>>>")
    println("Masukkan Nama Player 1 : ")
    val player1 = readLine()
    println("Halo $player1, Selamat Bermain :D")

    game()
}

private fun game() {
    var inputLawan: String
    var inputPlayer1: String

    do {
        print("Pilih Lawan (Player2 / Bot) : ")
        inputLawan = readLine()!!
        if(inputLawan == "Player2") {
            do {
                println("Game dimulai!!!!!!!!!!")
                println("Player 1 : [Batu / Gunting / Kertas] : ")
                inputPlayer1 = readLine()!!
                if(inputPlayer1 == "Batu" || inputPlayer1 == "Gunting" || inputPlayer1 == "Kertas") {
                    player2(inputPlayer1)
                    println("Ingin bermain lagi? (Y/N)")
                    val choice = readLine()!!
                    if(choice == "Y") {
                        game()
                    } else {
                        println("Terima Kasih Telah Bermain")
                        exitProcess(0)
                    }
                } else {
                    println("Input salah, hanya boleh yes/y atau no/n")
                }
            } while (inputPlayer1 != "Batu" && inputPlayer1 != "Gunting" && inputPlayer1 != "Kertas")
        }
        else if (inputLawan == "Bot") {
            println("Player 1 akan Melawan Bot!!")
            do {
                println("Game dimulai!!!!!!!!!!")
                println("Player 1 : [Batu / Gunting / Kertas] : ")
                inputPlayer1 = readLine()!!
                if(inputPlayer1 == "Batu" || inputPlayer1 == "Gunting" || inputPlayer1 == "Kertas") {
                    bot(inputPlayer1)
                    println("Ingin bermain lagi? (Y/N)")
                    val choice = readLine()!!
                    if(choice == "Y") {
                        game()
                    } else {
                        println("Terima Kasih Telah Bermain")
                        exitProcess(0)
                    }
                } else {
                    println("Input salah, hanya boleh yes/y atau no/n")
                }
            } while (inputPlayer1 != "Batu" && inputPlayer1 != "Gunting" && inputPlayer1 != "Kertas")
        } else {
            println("Input salah, hanya boleh Player2/Bot")
        }
    } while (inputLawan != "Player2" && inputLawan != "Bot")
}

private fun player2(inputPlayer1 : String) {
    var inputPlayer2: String
    do {
        print("Player 2 : [Batu / Gunting / Kertas] : ")
        inputPlayer2 = readLine()!!
        if (inputPlayer1 == inputPlayer2) {
            println("Hasil akhir yaitu Seri!")
        } else if (inputPlayer1 == "Batu" && inputPlayer2 == "Gunting") {
            println("Player 1 mengalahkan Player 2")
        } else if (inputPlayer1 == "Batu" && inputPlayer2 == "Kertas") {
            println("Player 2 menang melawan Player 1")
        } else if (inputPlayer1 == "Gunting" && inputPlayer2 == "Batu") {
            println("Player 2 menang melawan Player 1")
        } else if (inputPlayer1 == "Gunting" && inputPlayer2 == "Kertas") {
            println("Player 1 mengalahkan Player 2")
        } else if (inputPlayer1 == "Kertas" && inputPlayer2 == "Batu") {
            println("Player 1 mengalahkan Player 2")
        } else if (inputPlayer1 == "Kertas" && inputPlayer2 == "Gunting") {
            println("Player 2 menang melawan Player 1")
        } else {
            println("Input salah, hanya boleh 3 OPSI diatas secara spesifik.")
        }
    } while (inputPlayer2 != "Batu" && inputPlayer2 != "Gunting" && inputPlayer2 != "Kertas")
}

private fun bot(inputPlayer1 : String) {
    val randomBot = (1..4).random()
    var inputBot = ""

    when (randomBot) {
        1 -> inputBot = "Batu"
        2 -> inputBot = "Gunting"
        3 -> inputBot = "Kertas"
    }

    println("Bot: $inputBot")

    if (inputPlayer1 == inputBot) {
        println("Hasil akhir yaitu Seri!")
    } else if (inputPlayer1 == "Batu" && inputBot == "Gunting") {
        println("Player 1 Win!!")
    } else if (inputPlayer1 == "Batu" && inputBot == "Kertas") {
        println("Bot menaklukkan Player 1!!n")
    } else if (inputPlayer1 == "Gunting" && inputBot == "Batu") {
        println("Bot menaklukkan Player 1!!")
    } else if (inputPlayer1 == "Gunting" && inputBot == "Kertas") {
        println("Player 1 Win!!")
    } else if (inputPlayer1 == "Kertas" && inputBot == "Batu") {
        println("Player 1 Win!!")
    } else if (inputPlayer1 == "Kertas" && inputBot == "Gunting") {
        println("Bot menaklukkan Player 1!!")
    }
}