package AbschlussProjekt.GebaeudeKlassen

import AbschlussProjekt.GebaeudeKlassen.Gebaeude

class Koenigspalast(name: String, baukosten: Pair<String, Int>, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String, Int>,aktuelleRessourcen: MutableMap<String, Int>) :Gebaeude(name,baukosten,goldkosten,notwendigeBauern){

    fun siegesbedingung(){
        if (deineGebaeude["Königspalst"] != null){
            println("Herzlichen Glückwunsch, dein Dorf wird nun von einem König angeführt")
        }
    }
}



