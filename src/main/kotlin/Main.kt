fun main() {
    val amount = readLine()
    val length = amount?.length
    val lastChar = length?.minus(1)?.let { amount?.get(it) }

    if (length != null) {
        if (length > 1) {
            val previousChar = length?.minus(2)?.let { amount?.get(it) }
            if (lastChar == '1' && previousChar != '1') print("Понравилось $amount человеку")
            else print("Понравилось $amount людям")

        } else if (length == 1) {
            if (lastChar == '1') print("Понравилось $amount человеку")
            else print("Понравилось $amount людям")
        }
    }
}



