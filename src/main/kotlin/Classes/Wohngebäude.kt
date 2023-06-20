package Classes
import Classes.Ressourcen.aktuelleRessourcen
class Wohngebäude(name: String, baukosten: Pair<String, Int>, bauern: Int, ertragValue: Int, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String, Int>) : Gebäude(name,baukosten,goldkosten,notwendigeBauern){

    var neueBauern: Int = 10
    var ertrag: Int = ertragValue

    init {
        neueBauern = bauern
        ertrag = ertragValue
    }

    fun bevoelkerungszuwachs(){
        if (gebaeudeName == "Bauernhaus"){
            if (aktuelleRessourcen["Bretter"]!! >= 2){
                aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! -2
                println("Bauernhaus wurde errichte.")
                if (gebaeudeName == "Bauernhaus"){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! +10
                    println("Deine Bevölkerung ist um 10 Bauern gewachsen.")
                }
            } else {
                println("Du hast nicht genug Ressourcen.") }
        }
    }
}
