import TomtelandUppgift.Tomteland
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TomtelandKtTest {

    val tl = Tomteland()

    private val chiefHierarchy = listOf(
        "Tomten" to listOf("Glader", "Butter"),
        "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
        "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"),
        "Räven" to listOf("Gråsuggan", "Myran"),
        "Myran" to listOf("Bladlusen")
    )

    private val underlingsTomten = listOf("Glader", "Butter", "Tröger", "Trötter", "Blyger", "Rådjuret", "Nyckelpigan", "Haren", "Skumtomten", "Dammråttan", "Räven", "Gråsuggan", "Myran", "Bladlusen")
    private val underlingsGlader = listOf("Tröger", "Trötter", "Blyger", "Skumtomten", "Dammråttan")
    private val underlingsButter = listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen")
    private val underlingsTrötter = listOf("Skumtomten", "Damråttan")
    private val underlingsSkumtomten = listOf("Dammråttan")
    private val underlingsRäven = listOf("Gråsuggan", "Myran", "Bladlusen")
    private val underlingsMyran = listOf("Bladlusen")

    @Test
    fun getUnderlingsBladlusenTest() {
        val underlings = tl.getUnderlings("Bladlusen", chiefHierarchy)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsTrögerTest() {
        val underlings = tl.getUnderlings("Tröger", chiefHierarchy)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsBlygerTest() {
        val underlings = tl.getUnderlings("Blyger", chiefHierarchy)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsDammråttanTest() {
        val underlings = tl.getUnderlings("Dammråttan", chiefHierarchy)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsGråsugganTest() {
        val underlings = tl.getUnderlings("Gråsuggan", chiefHierarchy)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsHarenTest() {
        val underlings = tl.getUnderlings("Haren", chiefHierarchy)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsNyckelpiganTest() {
        val underlings = tl.getUnderlings("Nyckelpigan", chiefHierarchy)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsRådjuretTest() {
        val underlings = tl.getUnderlings("Rådjuret", chiefHierarchy)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsMyranTest() {
        val underlings = tl.getUnderlings("Myran", chiefHierarchy)
        assertEquals(underlings.size, underlingsMyran.size)
    }

    @Test
    fun getUnderlingsRävenTest() {
        val underlings = tl.getUnderlings("Räven", chiefHierarchy)
        assertEquals(underlings.size, underlingsRäven.size)
    }

    @Test
    fun getUnderlingsSkumtomtenTest() {
        val underlings = tl.getUnderlings("Skumtomten", chiefHierarchy)
        assertEquals(underlings.size, underlingsSkumtomten.size)
    }

    @Test
    fun getUnderlingsTrötterTest() {
        val underlings = tl.getUnderlings("Trötter", chiefHierarchy)
        assertEquals(underlings.size, underlingsTrötter.size)
    }

    @Test
    fun getUnderlingsButterTest() {
        val underlings = tl.getUnderlings("Butter", chiefHierarchy)
        assertEquals(underlings.size, underlingsButter.size)
    }

    @Test
    fun getUnderlingsGladerTest() {
        val underlings = tl.getUnderlings("Glader", chiefHierarchy)
        assertEquals(underlings.size, underlingsGlader.size)
    }

    @Test
    fun getUnderlingsTomtenTest() {
        val underlings = tl.getUnderlings("Tomten", chiefHierarchy)
        assertEquals(underlings.size, underlingsTomten.size)
    }
}
