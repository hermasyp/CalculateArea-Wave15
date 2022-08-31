package shape

class Triangle(
    private val base: Double,
    private val height: Double,
    private val hypothenusa: Double
) : Shape() {
    init {
        shapeName = "Triangle"
    }
    override fun calculateArea(): Double {
        return 0.5 * base * height
    }

    override fun calculateCircular(): Double {
        return base + (2 * hypothenusa)
    }

}