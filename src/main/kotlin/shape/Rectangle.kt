package shape

class Rectangle(
    private val length: Double,
    private val width: Double
) : Shape() {

    init {
        shapeName = "Rectangle"
    }

    override fun calculateArea(): Double {
        return length*width
    }

    override fun calculateCircular(): Double {
        return (2 * (length + width))
    }
}