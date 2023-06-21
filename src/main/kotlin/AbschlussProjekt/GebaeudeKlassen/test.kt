package AbschlussProjekt.GebaeudeKlassen
import AbschlussProjekt.GebaeudeKlassen.Ressourcen.aktuelleRessourcen

var deineGebaeude: MutableMap<String, Int> = mutableMapOf()


fun main () {

    val marktplatz = Marktplatz("Marktplatz", "Bretter" to 10, "Gold" to 500, "Bauern" to 0)
    val bauernhaus = Wohngebaeude("Bauernhaus", "Holz" to 2, "Gold" to 0, "Bauern" to 10)
    val lagerhaus = Lagerhaus("Lagerhaus", "Bretter" to 10, "Gold" to 500, "Bauern" to 0)
    val holzhütte = Produktionsstaetten("Holzfällerhütte", "Ressourcen" to 0, "Bauern" to 5, "Gold" to 100, aktuelleRessourcen)
    val sägewerk = Produktionsstaetten("Sägewerk", "Ressourcen" to 0, "Bauern" to 10, "Gold" to 100, aktuelleRessourcen)

    repeat(50){bauernhaus.build(aktuelleRessourcen, deineGebaeude)}
    repeat(50) {bauernhaus.bevoelkerungszuwachs()}
    println()
    println(aktuelleRessourcen)
    println(deineGebaeude)
    println()
    repeat(100) {holzhütte.build(aktuelleRessourcen, deineGebaeude)}
    repeat(100){ holzhütte.produktion()}
    println()
    println(aktuelleRessourcen)
    println()
    repeat(100){sägewerk.build(aktuelleRessourcen, deineGebaeude)}
    repeat(100){sägewerk.produktion()}
    println()
    println(deineGebaeude)
    println(aktuelleRessourcen)
}