package AbschlussProjekt.GebaeudeKlassen

import AbschlussProjekt.GebaeudeKlassen.Gebaeude
import kotlin.system.exitProcess

class Koenigspalast(name: String, baukosten: Pair<String, Int>, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String, Int>,aktuelleRessourcen: MutableMap<String, Int>) :Gebaeude(name,baukosten,goldkosten,notwendigeBauern){

    fun siegesbedingung(){
        if (deineGebaeude["Königspalast"] != null){
            println("Herzlichen Glückwunsch, dein Dorf wird nun von einem König angeführt.")
        }
    }
}

// Das ist meine Unterklasse Königspalast. hier Definiere ich zusätzlich eine Methode für die Siegesbedingung mit der Ich das Spiel gewinnen kann.


