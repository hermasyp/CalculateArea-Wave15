package shape

import kotlin.math.pow

class Circle(private val radius: Double) : Shape() {
    init {
        shapeName = "Circle"
    }

    override fun calculateArea(): Double {
        return Math.PI * radius.pow(2)
    }

    override fun calculateCircular(): Double {
        return 2 * Math.PI * radius
    }

}