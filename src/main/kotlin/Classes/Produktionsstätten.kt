package Classes
import Classes.Ressourcen.aktuelleRessourcen
import Classes.Ressourcen.maxRessourcen



class Produktionsstätten(name: String, baukosten: Pair<String, Int>, notwendigeBauern: Pair<String,Int>, goldkosten: Pair<String, Int>, var aktuelleRessourcen: MutableMap<String, Int> ) :Gebäude(name,baukosten,goldkosten,notwendigeBauern){


    var zeitAufwand: Int = 0



    fun produktion(){

        if (gebaeudeName == "Holzfällerhütte" && notwendigeBauern.second == 5 ) {
            zeitAufwand = 0
            for (i in 1.. 30){
                zeitAufwand++
                if (zeitAufwand == 30) {
                    if (aktuelleRessourcen["Holz"]!! + 1 <= maxRessourcen["Holz"]!!) {
                        aktuelleRessourcen["Holz"] = aktuelleRessourcen["Holz"]!! + 1
                        zeitAufwand = 0
                    }
                }
            }
            if (aktuelleRessourcen["Bauern"]!! >= 5) {
                aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! -5
            } else {
                println("Du hast nicht genug Bauern, baue mehr Bauernhäuser")
            }
        }


        if (gebaeudeName == "Sägewerk" && aktuelleRessourcen["Bauern"] == 10) {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! + 1
                    zeitAufwand = 0
                }
            }
        }

        if (gebaeudeName == "Fischerei" && notwendigeBauern.second == 25) {
            zeitAufwand = 0
            for (i in 1..50) {
                zeitAufwand++
                if (zeitAufwand == 50) {
                    aktuelleRessourcen["Fisch"] = aktuelleRessourcen["Fisch"]!! + 1
                    zeitAufwand = 0
                }
            }
        }
        if (gebaeudeName == "Schäferei" && notwendigeBauern.second == 10) {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Wolle"] = aktuelleRessourcen["Wolle"]!! + 1
                    zeitAufwand = 0
                }
            }
        }
        if (gebaeudeName == "Weberei" && notwendigeBauern.second == 50) {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Arbeitskleidung"] = aktuelleRessourcen["Arbeitskleidung"]!! + 1
                    zeitAufwand = 0
                }
            }
        }
        if (gebaeudeName == "Kartoffelhof" && notwendigeBauern.second == 25) {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Kartoffeln"] = aktuelleRessourcen["Kartoffeln"]!! + 1
                    zeitAufwand = 0
                }
            }
        }
        if (gebaeudeName == "Schnapsbrennerei" && notwendigeBauern.second == 50) {
            zeitAufwand = 0
            for (i in 1..30) {
                zeitAufwand++
                if (zeitAufwand == 30) {
                    aktuelleRessourcen["Schnaps"] = aktuelleRessourcen["Schnaps"]!! + 1
                    zeitAufwand = 0
                }
            }
        }
    }
}