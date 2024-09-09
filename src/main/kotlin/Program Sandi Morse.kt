fun main(args: Array<String>) {
// split() and joinToString()
// Morse code decoder
// the string which we want to decodeval s = ".. -.-. -... ----.-. .. .-.-.."
    // println("The original message: $s")
// the string with the decoded messagevar message = ""

// array definitions
    // val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
// splitting the string into Morse characters
// val characters // = s.split(" ")
// iterating over Morse charactersfor (morseChar in characters)
// {val index = morseChars.indexOf(morseChar)
// character was foundif (index != -1) {
// message += alphabetChars[index]}}println("The decoded message: $message")
}