// https://www.codewars.com/kata/56445c4755d0e45b8c00010a/train/kotlin

fun fortune(f0: Int, p: Double, c0: Int, n: Int, i: Double): Boolean {
    var balance = f0
    var withdraw = c0

    for (j in 1 until n) {
        balance = balance + (p / 100.0 * balance).toInt() - withdraw
        withdraw += (i / 100.0 * withdraw.toDouble()).toInt()
    }

    return balance >= 0
}

fun main() {
    println(fortune(100000, 1.0, 2000, 15, 1.0))
    println(fortune(100000, 1.0, 9185, 12, 1.0))
}