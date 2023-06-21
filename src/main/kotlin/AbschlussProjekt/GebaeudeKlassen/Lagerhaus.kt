package AbschlussProjekt.GebaeudeKlassen
import AbschlussProjekt.GebaeudeKlassen.Ressourcen.aktuelleRessourcen
import AbschlussProjekt.GebaeudeKlassen.Ressourcen.maxRessourcen                                                                              // Objekt vererbung aus 13:00 Uhr CP durch Johann

class Lagerhaus(name: String, baukosten: Pair<String, Int>, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String,Int>,) : Gebaeude(name,baukosten,goldkosten, notwendigeBauern){




    private fun istLagerVoll() :Boolean {
        for ((ressourcen, höchstwert) in maxRessourcen){
            var vorhandeneRessorcen = aktuelleRessourcen[ressourcen]
            if (vorhandeneRessorcen != höchstwert){
                return false
            }
        }
        return true
    }

    private fun produktionMöglich() :Boolean{
        for ((ressourcen, höchstwert) in maxRessourcen){
            var vorhandeneRessorcen = aktuelleRessourcen[ressourcen]
            if (vorhandeneRessorcen != null) {                                  // <-- Diese Zeile hat mein Cooles IntellyJ hinzugefügt.
                if (vorhandeneRessorcen < höchstwert) {
                    return true
                }
            }
        }
        return false
    }

    fun start(){
        if (produktionMöglich()){
            println("Die Produktion läuft.")
        }
    }

    fun stop(){
        if (istLagerVoll()){
            println("Die Produktion kommt zum stop.")
        }
    }
}