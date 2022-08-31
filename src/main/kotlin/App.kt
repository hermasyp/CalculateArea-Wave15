import shape.Circle
import shape.Rectangle
import shape.Shape
import shape.Triangle

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    fun start() {
        printHeader()
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun printHeader() {
        println(
            """
            ======================================
            Console app for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle Area
            2. Calculate Circle Area
            3. Calculate Triangle Area
            ======================================
            Enter menu ? (1/2/3)
            ======================================
        """.trimIndent()
        )
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                //open menu rectangle
                openMenuRectangle()
            }

            "2" -> {
                //open menu circle
                openMenuCircle()
            }

            "3" -> {
                //open menu Triangle
                openMenuTriangle()
            }

            else -> {
                println("No menu matches")
                start()
            }
        }
    }

    private fun openMenuRectangle() {
        println("Enter Length = ")
        val length = readLine()?.toDouble() ?: 0.0
        println("Enter Width = ")
        val width = readLine()?.toDouble() ?: 0.0
        printShape(Rectangle(length, width))
    }

    private fun openMenuCircle() {
        println("Enter Radius = ")
        val radius = readLine()?.toDouble() ?: 0.0
        printShape(Circle(radius))
    }

    private fun openMenuTriangle() {
        println("Enter Base = ")
        val base = readLine()?.toDouble() ?: 0.0
        println("Enter Height = ")
        val height = readLine()?.toDouble() ?: 0.0
        println("Enter Hypothenusa = ")
        val hypothenusa = readLine()?.toDouble() ?: 0.0
        printShape(Triangle(base, height, hypothenusa))
    }

    // Segitiga, Kotak, Lingkaran
    // Bentuk 2D -> Luas dan keliling
    // Parent class -> Shape -> Triangle, Circle, Rectangle

    private fun printShape(shape: Shape) {
        shape.printShapeName()
        shape.printResult()
    }
}