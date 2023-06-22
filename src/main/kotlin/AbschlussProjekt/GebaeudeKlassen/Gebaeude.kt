package AbschlussProjekt.GebaeudeKlassen

open class Gebaeude(name: String, baukosten: Pair<String, Int>, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String, Int>) {

    var gebaeudeName: String = name
    var baukosten = baukosten
    var goldkosten = goldkosten
    var notwendigeBauern = notwendigeBauern

    fun build(aktuelleRessourcen: MutableMap<String, Int>, deineGebaeude: MutableMap<String, Int>):String {

        when (gebaeudeName) {

            "Bauernhaus" -> {

                baukosten = "Bretter" to 5

                if (deineGebaeude["Marktplatz"] != null){

                    println("Wieviele Bauernhäuser möchtest du errichten ?")

                    var bauernhaeuserMenge = readln().toInt()
                    var kosten = bauernhaeuserMenge * baukosten.second

                    if (aktuelleRessourcen["Bretter"]!! >= kosten) {
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - kosten
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! + bauernhaeuserMenge * 1000
                        println("$bauernhaeuserMenge Gebäude errichtet.")

                        var neueBauern = bauernhaeuserMenge * 10
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! + neueBauern
                        println("Deine Bevölkerung ist um $neueBauern Bauern gewachsen.")
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + bauernhaeuserMenge
                    } else {
                        println("Du hast nicht genügend Bretter um ein bauernhaus zu errichten.")
                        }
                } else {
                    println("Du musst zuerst einen Marktplatz errichten.")
                }
            }

            "Holzfällerhütte" -> {

                goldkosten = "Gold" to 500
                notwendigeBauern = "Bauern" to 10

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second ) {
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                        println("Holzfällerhütte wurde errichtet.")

                        var neuesHolz = 75
                        aktuelleRessourcen["Holz"] = aktuelleRessourcen["Holz"]!! + neuesHolz
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                    } else {
                        println("Du hast nicht genügend Gold um eine Holzfällerhütte zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um die Holzfällerhütte zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                }
            }

            "Sägewerk" -> {

                goldkosten = "Gold" to 1000
                notwendigeBauern = "Bauern" to 15

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                        println("Sägewerk wurde errichtet.")

                        var neueBretter = 75
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! + neueBretter
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                    } else {
                        println("Du hast nicht genügend Gold um ein Sägewerk zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um das Sägewerk zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                }
            }

            "Fischerei" -> {

                goldkosten = "Gold" to 1000
                baukosten = "Bretter" to 10
                notwendigeBauern = "Bauern" to 30

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                        if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                            aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                            println("Fischerei wurde errichtet")

                            var neueFische = 75
                            aktuelleRessourcen["Fisch"] = aktuelleRessourcen["Fisch"]!! + neueFische
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Bretter um eine Fischerei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Gold um eine Fischerei zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um die Fischerei zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                }
            }

            "Schäferei" -> {

                goldkosten = "Gold" to 1000
                baukosten = "Bretter" to 10
                notwendigeBauern = "Bauern" to 15

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second){
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second                                  //deineGebaeude[gebaeudeName] = gebaeudeAnzahl +1
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Schäferei wurde errichtet")

                            var neueWolle = 75
                            aktuelleRessourcen["Wolle"] = aktuelleRessourcen["Wolle"]!! + neueWolle
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Gold um eine Schäferei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Bretter um eine Schäferei zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um die Schäferei zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                }
            }

            "Weberei" -> {

                goldkosten = "Gold" to 2000
                baukosten = "Bretter" to 10
                notwendigeBauern = "Bauern" to 50

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Weberei wurde errichtet")

                            var neueKleidung = 75
                            aktuelleRessourcen["Arbeitskleidung"] = aktuelleRessourcen["Arbeitskleidung"]!! + neueKleidung
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Gold um eine Weberei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Bretter um eine Weberei zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um die Weberei zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                }
            }

            "Kartoffelhof" -> {

                goldkosten = "Gold" to 1000
                baukosten = "Bretter" to 10
                notwendigeBauern = "Bauern" to 25

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Kartoffelhof wurde errichtet")

                            var neueKartoffeln = 75
                            aktuelleRessourcen["Kartoffeln"] = aktuelleRessourcen["Kartoffeln"]!! + neueKartoffeln
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Gold um ein Kartoffelhof zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Bretter um ein Kartoffelhof zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um das Kartoffelhof zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                }
            }

            "Schnapsbrennerei" -> {

                goldkosten = "Gold" to 5000
                baukosten = "Bretter" to 20
                notwendigeBauern = "Bauern" to 50

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Schnapsbrennerei wurde errichtet")

                            var neuerSchnaps = 75
                            aktuelleRessourcen["Schnaps"] = aktuelleRessourcen["Schnaps"]!! + neuerSchnaps
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Gold um eine Schnapsbrennerei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Bretter um eine Schnapsbrennerei zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um das Kartoffelhof zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                }
            }

            "Lagerhaus" -> {

                goldkosten = "Gold" to 2000
                baukosten = "Bretter" to 20

                if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                        println("Lagerhaus wurde errichtet")
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                    } else {
                        println("Du hast nicht genügend Gold um ein Lagerhaus zu errichten.")
                    }
                } else {
                    println("Du hast nicht genügend Bretter um ein Lagerhaus zu errichten.")
                }
            }

            "Marktplatz" -> {

                goldkosten = "Gold" to 1500
                baukosten = "Bretter" to 15

                if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                    aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                    if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                        println("Marktplatz wurde errichtet")
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                    } else {
                        println("Du hast nicht genügend Gold um ein Marktplatz zu errichten.")
                    }
                } else {
                    println("Du hast nicht genügend Bretter um ein Marktplatz zu errichten.")
                }
            }

            "Königspalast" -> {

                goldkosten = "Gold" to 50000
                baukosten = "Bretter" to 50
                notwendigeBauern = "Bauern" to 1000

                if (deineGebaeude["Holzfällerhütte"] != null && deineGebaeude["Sägewerk"] != null && deineGebaeude["Fischerei"] != null &&deineGebaeude["Schäferei"] != null &&
                    deineGebaeude["Weberei"] != null && deineGebaeude["Kartoffelhof"] != null && deineGebaeude["Schnapsbrennerei"] != null)
                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                        if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                            aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                            if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                                aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                                println("Marktplatz wurde errichtet")
                                deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                            } else {
                                println("Du hast nicht genügend Gold um ein Königspalast zu errichten.")
                            }
                        } else {
                            println("Du hast nicht genügend Bretter um ein Königspalast zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genug Bauern um den König Zufrieden zu stellen. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                    }
            }
        }
        return ""
    }

    override fun toString():String{
        return gebaeudeName
    }
}