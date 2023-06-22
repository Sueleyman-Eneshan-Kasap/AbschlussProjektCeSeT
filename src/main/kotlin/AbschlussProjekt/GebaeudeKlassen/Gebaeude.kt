package AbschlussProjekt.GebaeudeKlassen

open class Gebaeude(name: String, baukosten: Pair<String, Int>, goldkosten: Pair<String, Int>, notwendigeBauern: Pair<String, Int>) {               // Das ist meine Superklasse von der ich über den Primären Konstruktor einige Eigenschaften weitervererbe.

    var gebaeudeName: String = name                                                                                                                 //
    var baukosten = baukosten                                                                                                                       //
    var goldkosten = goldkosten                                                                                                                     //
    var notwendigeBauern = notwendigeBauern                                                                                                         // Hier definiere ich mit variablen neue und zutreffendere Namen für meine Eigenschaften.

    fun build(aktuelleRessourcen: MutableMap<String, Int>, deineGebaeude: MutableMap<String, Int>):String {                                         // Das ist meine Methode, mit der ich jeweiliges Gebäude erstellen kann. Sie nutzt meine Ressourcen und Gebäude Maps als Parameter und hat eine String als Rückgabewert.

        when (gebaeudeName) {                                                                                                                       // Hier beginnt meine when verzweigung. Wenn also Gebäudename, dann (folgende Kommentare lesen)...

            "Bauernhaus" -> {                                                                                                                       // Wenn also der Gebäudename der eingabe, in dem Fall Bauernhaus ist, dann soll der Schleifeninhalt je nach bedingung ablaufen.

                baukosten = "Bretter" to 5                                                                                                          // Hier Definiere ich meine Baukosten.

                if (deineGebaeude["Marktplatz"] != null){                                                                                           // Falls also in meiner Map der key Marktplatz vorhanden ist, wird man gefragt, wieviele Bauernhäuser gebaut werden sollen.
                    println("Wieviele Bauernhäuser möchtest du errichten ?")

                    var bauernhaeuserMenge = readln().toInt()                                                                                       // Hier definiere ich eine neue Variable, um die eingabe der Anzahl für die zu bauenden Bauernhäuser mit einer readln() festzuhalten
                    var kosten = bauernhaeuserMenge * baukosten.second                                                                              // Hier definiere ich eine weitere Variable, um die gesamtkosten für die jeweilige anzahl der zu bauenden Bauernhäuser zu ermitteln. baukosten.second wird verwendet, um den zweiten Wert aus meinem baukosten paar zu verwenden.

                    if (aktuelleRessourcen["Bretter"]!! >= kosten) {                                                                                // Nun stelle ich eine weitere bedingung, in der ich sage, falls Bretter, die 100 % in meiner Map sind, und ihr wert größer gleich der kosten die entstehen sind, der schleifen inhalt ausgeführt werden soll.
                        aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - kosten                                                    // Hier bekam ich hilfe von Pavel meinem Tutor. Jetzt wird der neue wert für Bretter beim Erstellen von Bauernhaus festgelegt. Es werden die Kosten für den Bau von Bauernhaus aud der ressourcen Map Subtrahiert.
                        aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! + bauernhaeuserMenge * 1000                                       // Hier definiere ich, dass jedes Bauernhaus Gold generiert (In dem fall 1000 Pro Bauernhaus) und diese beim Bau der Ressourcen Map hinzufügt.
                        println("$bauernhaeuserMenge Gebäude errichtet.")                                                                           // printline zu ausgabe wieviele neue gebäude errichtet wurden.

                        var neueBauern = bauernhaeuserMenge * 15                                                                                    // neue Variable für Anzahl der Bauern, die neu generiert werden, Pro Bauernhaus das gebaut wird.
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! + neueBauern                                                  // Hinzufügen der neuen Bauern zu Ressourcen Map.
                        println("Deine Bevölkerung ist um $neueBauern Bauern gewachsen.")                                                           // Printline zur ausgabe um wieviele Bauern die Bevölkerung gewachsen ist.
                        deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + bauernhaeuserMenge                   // Hierfür habe ich Chat Gpt genutzt (getOrDefault), der Code fügt gebaute Gebäude der deineGebäude Map hinzu.
                    } else {
                        println("Du hast nicht genügend Bretter um ein bauernhaus zu errichten.")                                                   // das ist meine else ausgabe, dafür das nicht genügend ressourcen verfügbar sind zum bauen.
                        }
                } else {
                    println("Du musst zuerst einen Marktplatz errichten.")                                                                          // das ist die ausgabe dafür das zuerst ein marktplatz errichtet werden muss da die bedingung nicht erfüült wird.
                }
            }
                                                                                                                                                    // der rest meines Codes baut auf denselben prinzipien auf. Bis auf weiter unten im Code.
            "Holzfällerhütte" -> {

                goldkosten = "Gold" to 500
                notwendigeBauern = "Bauern" to 10

                if (deineGebaeude["Lagerhaus"] != null) {

                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
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

                } else {
                    println("Baue zuerst ein Lagerhaus.")
                }
            }

            "Sägewerk" -> {

                goldkosten = "Gold" to 1000
                notwendigeBauern = "Bauern" to 15

                if (deineGebaeude["Lagerhaus"] != null) {
                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                        if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                            aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                            println("Sägewerk wurde errichtet.")

                            var neueBretter = 75
                            var holzToBrett = neueBretter
                            if (aktuelleRessourcen["Holz"]!! >= holzToBrett) {
                                aktuelleRessourcen["Holz"] = aktuelleRessourcen["Holz"]!! - holzToBrett
                                aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! + neueBretter
                                deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                            } else {
                                println("Du hast nicht genug Holz um Bretter zu Produzieren. Baue eine Holzfällerhütte zum Holz Produzieren.")
                            }
                        } else {
                            println("Du hast nicht genügend Gold um ein Sägewerk zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genug Bauern um das Sägewerk zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                    }
                } else {
                    println("Baue zuerst ein Lagerhaus.")
                }
            }

            "Fischerei" -> {

                goldkosten = "Gold" to 1000
                baukosten = "Bretter" to 10
                notwendigeBauern = "Bauern" to 30

                if (deineGebaeude["Lagerhaus"] != null) {
                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
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
                } else {
                    println("Baue zuerst ein Lagerhaus.")
                }
            }

            "Schäferei" -> {

                goldkosten = "Gold" to 1000
                baukosten = "Bretter" to 10
                notwendigeBauern = "Bauern" to 15

                if (deineGebaeude["Lagerhaus"] != null) {
                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                        if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                            aktuelleRessourcen["Bretter"] =
                                aktuelleRessourcen["Bretter"]!! - baukosten.second                                  //deineGebaeude[gebaeudeName] = gebaeudeAnzahl +1
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
                } else {
                    println("Baue zuerst ein Lagerhaus.")
                }
            }

            "Weberei" -> {

                goldkosten = "Gold" to 2000
                baukosten = "Bretter" to 10
                notwendigeBauern = "Bauern" to 50

                if (deineGebaeude["Lagerhaus"] != null) {
                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                        if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                            aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                            if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                                aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                                println("Weberei wurde errichtet")

                                var neueKleidung = 75
                                var wolleToArbeitskleidung = neueKleidung
                                if (aktuelleRessourcen["Wolle"]!! >= wolleToArbeitskleidung) {
                                    aktuelleRessourcen["Wolle"] = aktuelleRessourcen["Wolle"]!! - wolleToArbeitskleidung
                                    aktuelleRessourcen["Arbeitskleidung"] =
                                        aktuelleRessourcen["Arbeitskleidung"]!! + neueKleidung
                                    deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                                } else {
                                    println("Du hast nicht genug Wolle um Arbeitskleidung zu Produzieren. Baue Schäferei um Wolle zu Produzieren.")
                                }
                            } else {
                                println("Du hast nicht genügend Gold um eine Weberei zu errichten.")
                            }
                        } else {
                            println("Du hast nicht genügend Bretter um eine Weberei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genug Bauern um die Weberei zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                    }
                } else {
                    println("Baue zuerst ein Lagerhaus.")
                }
            }

            "Kartoffelhof" -> {

                goldkosten = "Gold" to 1000
                baukosten = "Bretter" to 10
                notwendigeBauern = "Bauern" to 25

                if (deineGebaeude["Lagerhaus"] != null) {
                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
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
                } else {
                    println("Baue zuerst ein Lagerhaus.")
                }
            }

            "Schnapsbrennerei" -> {

                goldkosten = "Gold" to 5000
                baukosten = "Bretter" to 20
                notwendigeBauern = "Bauern" to 50

                if (deineGebaeude["Lagerhaus"] != null) {
                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                        if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                            aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                            if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                                aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                                println("Schnapsbrennerei wurde errichtet")

                                var neuerSchnaps = 75
                                var kartoffelToSchnaps = neuerSchnaps
                                if (aktuelleRessourcen["Kartoffeln"]!! >= kartoffelToSchnaps) {
                                    aktuelleRessourcen["Kartoffeln"] =
                                        aktuelleRessourcen["Kartoffeln"]!! - kartoffelToSchnaps
                                    aktuelleRessourcen["Schnaps"] = aktuelleRessourcen["Schnaps"]!! + neuerSchnaps
                                    deineGebaeude[gebaeudeName] = deineGebaeude.getOrDefault(gebaeudeName, 0) + 1
                                } else {
                                    println("Du hast nicht genug Kartoffeln um Schnaps zu Brennen. Baue Kartoffelhof um Kartoffeln zu Ernten.")
                                }
                            } else {
                                println("Du hast nicht genügend Gold um eine Schnapsbrennerei zu errichten.")
                            }
                        } else {
                            println("Du hast nicht genügend Bretter um eine Schnapsbrennerei zu errichten.")
                        }
                    } else {
                        println("Du hast nicht genug Bauern um das Kartoffelhof zu betreiben. Baue zuerst Bauernhäuser, damit Bauern einziehen können.")
                    }
                } else {
                    println("Baue zuerst ein Lagerhaus.")
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

                if (deineGebaeude["Holzfällerhütte"] != null && deineGebaeude["Sägewerk"] != null && deineGebaeude["Fischerei"] != null && deineGebaeude["Schäferei"] != null &&                // Hier stelle ich mit dem Und && Operator gleich mehrere bedingungen und lege fest das mehrere gebäude bereits gebaut sein müssen, um dass Königspalast zu errichten.
                    deineGebaeude["Weberei"] != null && deineGebaeude["Kartoffelhof"] != null && deineGebaeude["Schnapsbrennerei"] != null)
                    if (aktuelleRessourcen["Bauern"]!! >= notwendigeBauern.second) {
                        aktuelleRessourcen["Bauern"] = aktuelleRessourcen["Bauern"]!! - notwendigeBauern.second
                        if (aktuelleRessourcen["Bretter"]!! >= baukosten.second) {
                            aktuelleRessourcen["Bretter"] = aktuelleRessourcen["Bretter"]!! - baukosten.second
                            if (aktuelleRessourcen["Gold"]!! >= goldkosten.second) {
                                aktuelleRessourcen["Gold"] = aktuelleRessourcen["Gold"]!! - goldkosten.second
                                println("Königspalast wurde errichtet")
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

                } else -> println("Du benötigst mindestens ein Gebäude von jeder Produktionsstätte.")
            }
            return ""
        }
    }



