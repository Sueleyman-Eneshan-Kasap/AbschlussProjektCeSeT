package AbschlussProjekt.GebaeudeKlassen

object Ressourcen  {

    var maxRessourcen: Map<String, Int> = mapOf(
            "Holz" to 75,
            "Bretter" to 75,
            "Fisch" to 75,
            "Wolle" to 75,
            "Arbeitskleidung" to 75,
            "Kartoffeln" to 75,
            "Schnaps" to 75,
            "Bauern" to 999999999,
            "Gold" to 999999999
    )

    var aktuelleRessourcen: MutableMap<String, Int> = maxRessourcen.toMutableMap()
    init {
            aktuelleRessourcen["Holz"] = 0
            aktuelleRessourcen["Bretter"] = 25
            aktuelleRessourcen["Fisch"] = 0
            aktuelleRessourcen["Wolle"] = 0
            aktuelleRessourcen["Arbeitskleidung"] = 0
            aktuelleRessourcen["Kartoffeln"] = 0
            aktuelleRessourcen["Schnaps"] = 0
            aktuelleRessourcen["Bauern"] = 0
            aktuelleRessourcen["Gold"] = 75000
    }
}
