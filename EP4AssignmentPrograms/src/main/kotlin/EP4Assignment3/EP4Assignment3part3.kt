package EP4Assignment3

/*
3.3 Automorphic Numbers
 Check if a number is an automorphic number, which is a number whose square ends in the
same digits as the number itself. For example, 25 is an automorphic number because (25^2 =
625).
 */

fun main(){
    println(checkAutomorphic(376))
}

fun checkAutomorphic(num: Int): Boolean { // Here interestingly I took help of print reverse number program
    var squareofNumber = num * num
    var digit = 0
        var number = num
        while (number != 0) {
            number = number / 10
            digit = digit + 1
        }

    var resultVariable = (squareofNumber % (Math.pow(10.0, digit.toDouble()))).toInt()

    return resultVariable == num
}