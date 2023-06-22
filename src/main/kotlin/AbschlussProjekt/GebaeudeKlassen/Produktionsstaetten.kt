package AbschlussProjekt.GebaeudeKlassen

class Produktionsstaetten(name: String, baukosten: Pair<String, Int>, notwendigeBauern: Pair<String,Int>, goldkosten: Pair<String, Int>, var aktuelleRessourcen: MutableMap<String, Int> ) : Gebaeude(name,baukosten,goldkosten,notwendigeBauern){
}
// Hier habe ich eine Klasse Produktionstätten erstellt, die von meiner Superklasse Gebäude erbt. Es werden alle Eigenschaften vererbt. Zusätzlich habe ich eine weitere Variable erstellt, um beim instanzieren die aktuelleRessourcen mutableMap aufrufen kann von der ich die Ressourcen kosten abrechnen kann.