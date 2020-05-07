package subtask1

import kotlin.math.absoluteValue

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {

        if(numbers.isEmpty()) return null;

        var result =""

        for ((index,number) in numbers.reversed().withIndex()){

            if (number == 0) continue;

            val absNumber = number.absoluteValue

            val first = if (index == numbers.lastIndex) "" else if (number > 0) " + " else " - "
            val second = if (index == 0) "$absNumber" else if (absNumber == 1) "x" else "${absNumber}x"
            val third =  if (index < 2) "" else "^$index"

            result = "$first$second$third$result"
        }
        return result
        throw NotImplementedError("Not implemented")
    }
}
