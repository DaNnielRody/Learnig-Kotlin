package oop

class Player(
    private val name: String,
    private val surname: String,
    private var scores: Int = 0,
    private var bestScores: Int = 0
){
    fun fullName(): String {
        return "$name $surname"
    }

    fun whoWins(p1: Player, p2: Player): String {
        return if (p1.scores > p2.scores) {
            "Winner ${p1.fullName()} with a combined score of ${p1.scores} and a personal best level score of ${p1.bestScores}"
        } else {
            "Winner ${p2.fullName()} with a combined score of ${p2.scores} and a personal best level score of ${p2.bestScores}"
        }
    }

    fun sumPoints(points: Int) {
        this.scores += points
        if (points > this.bestScores) {
            this.bestScores = points
        }
    }
}

fun main(){
    val player = Player("Nicola", "Tesla")
    val player1 = Player("Thomas", "Edison")

    var lvlScore = 0

    // level 1
    lvlScore = 20
    player.sumPoints(lvlScore)
    player1.sumPoints(lvlScore)


    // level 2
    lvlScore = 35
    player.sumPoints(lvlScore)
    player1.sumPoints(lvlScore)

    // level 3
    lvlScore = 25
    player1.sumPoints(lvlScore)

    println(player.whoWins(player, player1))

}