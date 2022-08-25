fun main() {
    var number = 0
    var french = ""
    print("Enter a number: ")
    number = readln()!!.toInt()

    when (number) {
        1 -> french = "Un"
        2 -> french = "Duex"
        3 -> french = "Trois"
        4 -> french = "Quatre"
        5 -> french = "Cinq"
        6 -> french = "Six"
        7 -> french = "Sept"
        8 -> french = "Huit"
        9 -> french = "Neuf"
        10 -> french = "Dix"
        !in 1..10 -> french = "Out of bounds"
    }
    println("Number in french is: $french")
}