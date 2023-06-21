package AbschlussProjekt.GebaeudeKlassen

open class Gebaeude(name: String, baukosten: Pair<String, Int>, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String, Int>) {

    var gebaeudeName: String = name
    var baukosten = baukosten
    var goldkosten = goldkosten
    var notwendigeBauern = notwendigeBauern

    fun build(aktuelleRessourcen: MutableMap<String, Int>, deineGebaeude: MutableMap<String, Int>):String {

        when (gebaeudeName) {

            "Bauernhaus" -> {

                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 10

                if (deineGebaeude["Marktplatz"] != null){
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! + notwendigeBauern.second
                        println("Bauernhaus wurde errichtet.")
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                    } else {
                        println("Du hast nicht genügend Bretter um ein bauernhaus zu errrichten.")
                    }
                } else {
                    println("Du musst zuerst einen Marktplatz errichten.")
                }
                return "Bauernhaus"
            }

            "Holzfällerhütte" -> {

                goldkosten = "Gold" to 100
                notwendigeBauern = "Bauern" to 5

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second ) {
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                        println("Holzfällerhütte wurde errichtet.")
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                    } else {
                        println("Du hast nicht genügend Gold um eine Holzfällerhütte zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um die Holzfällerhütte zu betreiben")
                }
                return "Holzfällerhütte"
            }

            "Sägewerk" -> {

                goldkosten = "Gold" to 100
                notwendigeBauern = "Bauern" to 10

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                        println("Sägewerk wurde errichtet.")
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                    } else {
                        println("Du hast nicht genügend Gold um ein Sägewerk zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um das Sägewerk zu betreiben")
                }
                return "Sägewerk"
            }

            "Fischerei" -> {

                goldkosten = "Gold" to 100
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 25

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                        if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                            aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                            println("Fischerei wurde errichtet")
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Bretter um eine Fischerei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Gold um eine Fischerei zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um die Fischerei zu betreiben.")
                }
                return "Fischerei"
            }

            "Schäferei" -> {

                goldkosten = "Gold" to 100
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 10

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second){
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second                                  //deineGebaeude[gebaeudeName] = gebaeudeAnzahl +1
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Schäferei wurde errichtet")
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Gold um eine Schäferei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Bretter um eine Schäferei zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um die Schäferei zu betreiben.")
                }
                return "Schäferei"
            }

            "Weberei" -> {

                goldkosten = "Gold" to 400
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 50

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Weberei wurde errichtet")
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Gold um eine Weberei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Bretter um eine Weberei zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um die Weberei zu betreiben.")
                }
                return "Weberei"
            }

            "Kartoffelhof" -> {

                goldkosten = "Gold" to 100
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 25

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Kartoffelhof wurde errichtet")
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Gold um ein Kartoffelhof zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Bretter um ein Kartoffelhof zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um das Kartoffelhof zu betreiben.")
                }
                return "Kartoffelhof"
            }

            "Schnapsbrennerei" -> {

                goldkosten = "Gold" to 100
                baukosten = "Bretter" to 2
                notwendigeBauern = "Bauern" to 50

                if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second){
                    aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                    if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Schnapsbrennerei wurde errichtet")
                            deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                        } else {
                            println("Du hast nicht genügend Gold um eine Schnapsbrennerei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genügend Bretter um eine Schnapsbrennerei zu errichten.")
                    }
                } else {
                    println("Du hast nicht genug Bauern um das Kartoffelhof zu betreiben.")
                }
                return "Schnapsbrennerei"
            }

            "Lagerhaus" -> {

                goldkosten = "Gold" to 500
                baukosten = "Bretter" to 10

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
                return "Lagerhaus"
            }

            "Marktplatz" -> {

                goldkosten = "Gold" to 500
                baukosten = "Bretter" to 10

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
                return "Marktplatz"
            }

            "Königspalast" -> {

                goldkosten = "Gold" to 50000
                baukosten = "Bretter" to 50
                notwendigeBauern = "Bauern" to 1000

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
                    println("Du hast nicht genug Bauern um den König Zufrieden zu stellen")
                }
                return "Königspalast"
            }
        }
        return ""
    }

    override fun toString():String{
        return gebaeudeName
    }
}