package TomtelandUppgift

fun main() {
    val tl = Tomteland()
    tl.chiefHierarchy.map { chief ->
        val underlings = tl.getUnderlings(chief.first, tl.chiefHierarchy)
        println("${chief.first}: ${underlings.joinToString(", ")}")
    }
}

class Tomteland {

    val chiefHierarchy = listOf(
        "Tomten" to listOf("Glader", "Butter"),
        "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
        "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"),
        "Räven" to listOf("Gråsuggan", "Myran"),
        "Myran" to listOf("Bladlusen")
    )

    fun getUnderlings(name: String, list: List<Pair<String, List<String>>>): List<String> {
        return list.firstOrNull { it.first == name }?.second?.flatMap { underling ->
            listOf(underling) + getUnderlings(underling, list)
        } ?: emptyList()
    }
}
