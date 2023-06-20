package Classes
import Classes.Ressourcen.aktuelleRessourcen

var deineGebaeude: MutableList<Gebäude> = mutableListOf<Gebäude>()


fun main () {

    var bauernhaus = Wohngebäude("Bauernhaus", "Holz" to 2, 10, 10, "Gold" to 0, "Bauern" to 10 )
    var lagerhaus = Lagerhaus("Lagerhaus", "Bretter" to 10, "Gold" to 500, "Bauern" to 0, "Gold" to 20)
    var holzhütte = Produktionsstätten("Holzfällerhütte", "Ressourcen" to 0, "Bauern" to 5, "Gold" to 100, aktuelleRessourcen)


    repeat(50){bauernhaus.build(aktuelleRessourcen)}
    repeat(50) {bauernhaus.bevoelkerungszuwachs()}
    println(aktuelleRessourcen)
    holzhütte.build(aktuelleRessourcen)
    repeat(100){ holzhütte.produktion() }
    println(deineGebaeude)
    println(aktuelleRessourcen)

}