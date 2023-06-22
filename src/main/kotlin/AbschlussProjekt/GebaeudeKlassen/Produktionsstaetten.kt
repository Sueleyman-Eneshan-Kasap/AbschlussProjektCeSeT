package AbschlussProjekt.GebaeudeKlassen
import AbschlussProjekt.GebaeudeKlassen.Ressourcen.maxRessourcen


class Produktionsstaetten(name: String, baukosten: Pair<String, Int>, notwendigeBauern: Pair<String,Int>, goldkosten: Pair<String, Int>, var aktuelleRessourcen: MutableMap<String, Int> ) : Gebaeude(name,baukosten,goldkosten,notwendigeBauern){


    /*var zeitAufwand: Int = 0



    fun produktion(){

        if (gebaeudeName == "Holzfällerhütte") {
            zeitAufwand = 0
            for (i in 1.. 30){
                zeitAufwand++
                if (zeitAufwand == 30) {
                    if (aktuelleRessourcen["Holz"]!! + 1 <= maxRessourcen["Holz"]!!) {
                        aktuelleRessourcen["Holz"] = aktuelleRessourcen["Holz"]!! + 1
                        zeitAufwand = 0
                        produktion()
                    }
                }
            }
        }

        if (gebaeudeName == "Sägewerk") {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! + 1
                    zeitAufwand = 0
                    produktion()
                }
            }
        }

        if (gebaeudeName == "Fischerei") {
            zeitAufwand = 0
            for (i in 1..50) {
                zeitAufwand++
                if (zeitAufwand == 50) {
                    aktuelleRessourcen["Fisch"] = aktuelleRessourcen["Fisch"]!! + 1
                    zeitAufwand = 0
                    produktion()
                }
            }
        }

        if (gebaeudeName == "Schäferei") {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Wolle"] = aktuelleRessourcen["Wolle"]!! + 1
                    zeitAufwand = 0
                    produktion()
                }
            }
        }

        if (gebaeudeName == "Weberei") {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Arbeitskleidung"] = aktuelleRessourcen["Arbeitskleidung"]!! + 1
                    zeitAufwand = 0
                    produktion()
                }
            }
        }

        if (gebaeudeName == "Kartoffelhof") {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Kartoffeln"] = aktuelleRessourcen["Kartoffeln"]!! + 1
                    zeitAufwand = 0
                    produktion()
                }
            }
        }

        if (gebaeudeName == "Schnapsbrennerei") {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Schnaps"] = aktuelleRessourcen["Schnaps"]!! + 1
                    zeitAufwand = 0
                    produktion()
                }
            }
        }
    }*/
}