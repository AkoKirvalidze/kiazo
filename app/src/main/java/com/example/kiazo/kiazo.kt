package com.example.kiazo

class Fraction(val numerator: Double, val denominator: Double) {
    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator == other.numerator * denominator / other.denominator) {
                return true
            }

        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }
}

fun main(){
    val f1= Fraction(1.0, 2.0)
    var f2 = Fraction(1.0,2.0)
    println(f1==f2)
    println(f1)
}