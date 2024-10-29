/*
Q 25 of pdf
                1
             2  3  4
          5  6  7  8  9
      10 11 12 13 14 15 16
   17 18 19 20 21 22 23 24 25
 */

fun main() {
    pattern8(5)
}

fun pattern8(lines: Int) {
    repeat(lines){
        repeat(lines - it){
            print("   ") // 3 spaces
        }
        repeat(2 * it + 1 ){j->
            var digit = it * it + 1 + j
            if(digit / 10 == 0){
                print(" $digit ") // 1 space in back and front each
            }
            else{
                print("$digit ") // 1 space in end because it is 2 digit
            }
        }
        println()
    }
}