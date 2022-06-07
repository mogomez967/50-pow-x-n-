fun myPow(x: Double, n: Int): Double {
    // x is raised to n power

    if(n == 0) {
        return 1.toDouble()
    }

    else if(n > 0) {
        //is even
        if(n%2 == 0) {
            return myPow(x*x, n/2)
        }
        //is odd
        else {
            return x * myPow(x*x, (n-1)/2)
        }
    }
    else {
        if(n%2 == 0) {
            return myPow(x*x, n/2)
        }
        else {
            return (1/x) * myPow(x*x, (n+1)/2)
        }
    }
}

fun main() {
    println(myPow(2.10000, 3))
}