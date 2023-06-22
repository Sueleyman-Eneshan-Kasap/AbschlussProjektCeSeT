package AbschlussProjekt.GebaeudeKlassen

class Produktionsstaetten(name: String, baukosten: Pair<String, Int>, notwendigeBauern: Pair<String,Int>, goldkosten: Pair<String, Int>, var aktuelleRessourcen: MutableMap<String, Int> ) : Gebaeude(name,baukosten,goldkosten,notwendigeBauern){
}