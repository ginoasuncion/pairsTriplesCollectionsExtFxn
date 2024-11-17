package ginoasuncion.com.pairstriplescollectionsextfxn

//fun main() {
//    class Choice {
//        companion object {
//            var name: String = "lyric"
//            fun showDescription(name:String) = println("My favorite $name")
//        }
//    }
//
//    fun main() {
//        println(Choice.name)
//        Choice.showDescription("pick")
//        Choice.showDescription("selection")
//    }
//}


//fun main() {
//    val fish = listOf("Salmon", "Tuna", "Carp", "Trout", "Cod")
//
//    fun isFreshWater(fish: String): Boolean {
//        return fish in listOf("Carp", "Trout")
//    }
//
//    val twoLists = fish.partition { isFreshWater(it) }
//    println("freshwater: ${twoLists.first}")
//    println("saltwater: ${twoLists.second}")
//
//    val fishNet = "fish net" to "catching fish"
//    val compass = "compass" to "finding directions"
//    val rod = "fishing rod" to "fishing"
//    val flashlight = "flashlight" to "providing light"
//
//    println("${fishNet.first} used for ${fishNet.second}")
//    println("${compass.first} used for ${compass.second}")
//    println("${rod.first} used for ${rod.second}")
//    println("${flashlight.first} used for ${flashlight.second}")
////
////    val numbers = Triple(6, 9, 42)
////    println(numbers.toString())
////    println(numbers.toList())
//
//    val equipment2 = ("fish net" to "catching fish") to "equipment"
//    println("${equipment2.first} is ${equipment2.second}\n")
//    println("${equipment2.first.second}")
//
//    val equipment = "fish net" to "catching fish"
//    val (tool, use) = equipment
//    println("$tool is used for $use")
//
//    val numbers = Triple(6, 9, 42)
//    val (n1, n2, n3) = numbers
//    println("$n1 $n2 $n3")
//}

//fun main() {
////    val list = listOf(1, 5, 3, 4)
////    println(list.sum())
////
////    val list2 = listOf("a", "bbb", "cc")
////    println(list2.sum())
//
////    val list2 = listOf("a", "bbb", "cc")
////    println(list2.sumBy { it.length })
//
//    val list2 = listOf("a", "bbb", "cc")
//    for (s in list2.listIterator()) {
//        println("$s ")
//    }
//
//    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
//    println (scientific.get("guppy"))
//    println(scientific.get("zebra fish"))
//    println(scientific.get("swordtail"))
//
//    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
//
//    println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
//
//
//}

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

//fun main() {
////    const val rocks = 3
////
////    val value1 = complexFunctionCall() // OK
////    const val CONSTANT1 = complexFunctionCall() // NOT ok
//
//    println(MyClass.CONSTANT3.toString())
//}

fun String.hasSpaces(): Boolean {
    val found = this.indexOf(' ')
    // also valid: this.indexOf(" ")
    // returns positive number index in String or -1 if not found
    return found != -1
}

//class AquariumPlant(val color: String, private val size: Int)
//
//fun AquariumPlant.isRed() = color == "red"    // OK
//fun AquariumPlant.isBig() = size > 50         // gives error

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun main() {
    open class AquariumPlant(val color: String, private val size: Int)

    class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

    fun AquariumPlant.print() = println("AquariumPlant")
    fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

//    val plant = GreenLeafyPlant(size = 10)
//    plant.print()
//    println("\n")
//    val aquariumPlant: AquariumPlant = plant
//    aquariumPlant.print()

//    val AquariumPlant.isGreen: Boolean get() = color == "green"
//    println(aquariumPlant.isGreen)

    fun AquariumPlant?.pull() {
        this?.apply {
            println("removing $this")
        }
    }

    val plant: AquariumPlant? = null
    plant.pull()
}