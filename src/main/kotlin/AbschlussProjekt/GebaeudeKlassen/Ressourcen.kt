package AbschlussProjekt.GebaeudeKlassen

object Ressourcen  {

    var maxRessourcen: Map<String, Int> = mapOf(
            "Holz" to 1000,
            "Bretter" to 1000,
            "Fisch" to 1000,
            "Wolle" to 1000,
            "Arbeitskleidung" to 1000,
            "Kartoffeln" to 1000,
            "Schnaps" to 1000,
            "Bauern" to 999999999,
            "Gold" to 999999999
    )

    var aktuelleRessourcen: MutableMap<String, Int> = maxRessourcen.toMutableMap()
    init {
            aktuelleRessourcen["Holz"] = 0
            aktuelleRessourcen["Bretter"] = 50
            aktuelleRessourcen["Fisch"] = 0
            aktuelleRessourcen["Wolle"] = 0
            aktuelleRessourcen["Arbeitskleidung"] = 0
            aktuelleRessourcen["Kartoffeln"] = 0
            aktuelleRessourcen["Schnaps"] = 0
            aktuelleRessourcen["Bauern"] = 0
            aktuelleRessourcen["Gold"] = 75000
    }
}
