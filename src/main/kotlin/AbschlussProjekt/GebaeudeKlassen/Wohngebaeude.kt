package AbschlussProjekt.GebaeudeKlassen

class Wohngebaeude(name: String, baukosten: Pair<String, Int>, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String, Int>) : Gebaeude(name,baukosten,goldkosten,notwendigeBauern) {
}
// Hier habe ich eine Klasse Wohngebäude erstellt, die von meiner Superklasse Gebäude erbt. Es werden alle Eigenschaften vererbt.