package Classes

open class Gebäude(name: String, baukosten: Pair<String, Int>, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String, Int>) {

    var gebaeudeName: String = name
    var baukosten = baukosten
    var goldkosten = goldkosten
    var notwendigeBauern = notwendigeBauern
    var deineGebaeude: MutableList<Gebäude> = mutableListOf<Gebäude>()

    fun build(aktuelleRessourcen: MutableMap<String, Int>):String {

        when (gebaeudeName) {
            "Bauernhaus" -> {

                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 10
                if (aktuelleRessourcen["Bretter"]!! >= baukosten.second){
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! + notwendigeBauern.second
                    println("Bauernhaus wurde errichtet.")
                    deineGebaeude.add(this)
                } else {
                    println("Du hast nicht genügend Bretter.")
                }
                return "Bauernhaus"
            }

            "Holzfällerhütte" -> {

                goldkosten = "Gold" to 100
                notwendigeBauern = "Bauern" to 5
                if ((aktuelleRessourcen["Gold"]!! >= goldkosten.second) && (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second )) {
                    aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    println("Holzfällerhütte wurde errichtet.")
                    deineGebaeude.add(this)
                } else {
                    println("Bauen nicht möglich. Überprüfe ob du genug Gold und Bauern hast, um dieses Gebäude zu Bauen und Betreiben.")
                }
                return "Holzfällerhütte"
            }

            "Sägewerk" -> {

                goldkosten = "Gold" to 100
                notwendigeBauern = "Bauern" to 10
                if ((aktuelleRessourcen["Gold"]!! >= goldkosten.second) && (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second)) {
                    aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    println("Sägewerk wurde errichtet.")
                    deineGebaeude.add(this)
                } else {
                    println("Bauen nicht möglich. Überprüfe ob du genug Gold und Bauern hast, um dieses Gebäude zu Bauen und Betreiben.")
                }
                return "Sägewerk"
            }

            "Fischerei" -> {

                goldkosten = "Gold" to 100
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 25
                if ((aktuelleRessourcen["Gold"]!! >= goldkosten.second) && (aktuelleRessourcen["Bretter"]!! >= baukosten.second) && (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second)) {
                    aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    println("Fischerei wurde errichtet")
                    deineGebaeude.add(this)
                } else {
                    println("Bauen nicht möglich. Überprüfe ob du genug Ressourcen und Bauern hast, um dieses Gebäude zu Bauen und Betreiben.")
                }
                return "Fischerei"
            }

            "Schäferei" -> {

                goldkosten = "Gold" to 100
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 10
                if ((aktuelleRessourcen["Gold"]!! >= goldkosten.second) && (aktuelleRessourcen["Bretter"]!! >= baukosten.second) && (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second)) {
                    aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    println("Schäferei wurde errichtet")
                    deineGebaeude.add(this)
                } else {
                    println("Bauen nicht möglich. Überprüfe ob du genug Ressourcen und Bauern hast, um dieses Gebäude zu Bauen und Betreiben.")
                }
                return "Schäferei"
            }

            "Weberei" -> {

                goldkosten = "Gold" to 400
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 50
                if ((aktuelleRessourcen["Gold"]!! >= goldkosten.second) && (aktuelleRessourcen["Bretter"]!! >= baukosten.second) && (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second)) {
                    aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    println("Weberei wurde errichtet")
                    deineGebaeude.add(this)
                } else {
                    println("Bauen nicht möglich. Überprüfe ob du genug Ressourcen und Bauern hast, um dieses Gebäude zu Bauen und Betreiben.")
                }
                return "Weberei"
            }

            "Kartoffelhof" -> {

                goldkosten = "Gold" to 100
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 25
                if ((aktuelleRessourcen["Gold"]!! >= goldkosten.second) && (aktuelleRessourcen["Bretter"]!! >= baukosten.second) && (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second)) {
                    aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    println("Kartoffelhof wurde errichtet")
                    deineGebaeude.add(this)
                } else {
                    println("Bauen nicht möglich. Überprüfe ob du genug Ressourcen und Bauern hast, um dieses Gebäude zu Bauen und Betreiben.")
                }
                return "Kartoffelhof"
            }

            "Schnapsbrennerei" -> {

                goldkosten = "Gold" to 100
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 50
                if ((aktuelleRessourcen["Gold"]!! >= goldkosten.second) && (aktuelleRessourcen["Bretter"]!! >= baukosten.second) && (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second)) {
                    aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    println("Schnapsbrennerei wurde errichtet")
                    deineGebaeude.add(this)
                } else {
                    println("Bauen nicht möglich. Überprüfe ob du genug Ressourcen und Bauern hast, um dieses Gebäude zu Bauen und Betreiben.")
                }
                return "Schnapsbrennerei"
            }

            "Lagerhaus" -> {

                goldkosten = "Gold" to 500
                baukosten = "Bretter" to 10
                if ((aktuelleRessourcen["Gold"]!! >= goldkosten.second) && (aktuelleRessourcen["Bretter"]!! >= baukosten.second)) {
                    aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    println("Lagerhaus wurde errichtet")
                    deineGebaeude.add(this)
                } else {
                    println("Bauen nicht möglich. Überprüfe ob du genug Gold und Ressourcen hast, um dieses Gebäude zu Bauen.")
                }
                return "Lagerhaus"
            }
        }
        return ""
    }
}

