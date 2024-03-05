fun zap() {
    val weekday = "Monday"
    print("On $weekday, the opening hours are: ")
    when(weekday){
        "Monday" -> println("Open 8 AM to 12 PM")
        "Tuesday" -> println("Open 8 AM to 6 PM")
    }
}

fun main() {
    val weekday = "Friday"
    val hour = 20

    val isOpen = when(weekday){
        "Monday" -> hour in 8..12
        "Tuesday" -> hour in 6..10
        "Friday" -> hour in 12..20
        else -> false
    }

    if(isOpen){
        println("Little Lemon is Open")
    }else{
        println("Little Lemon is closed")
    }
}