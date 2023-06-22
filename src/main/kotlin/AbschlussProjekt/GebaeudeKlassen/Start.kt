package AbschlussProjekt.GebaeudeKlassen

import AbschlussProjekt.GebaeudeKlassen.Ressourcen.aktuelleRessourcen
import kotlin.concurrent.thread

val marktplatz = Marktplatz("Marktplatz", "Bretter" to 15, "Gold" to 1500, "Bauern" to 0)
val bauernhaus = Wohngebaeude("Bauernhaus", "Bretter" to 5, "Gold" to 0, "Bauern" to 10)
val lagerhaus = Lagerhaus("Lagerhaus", "Bretter" to 20, "Gold" to 2000, "Bauern" to 0)
val holz = Produktionsstaetten("Holzfällerhütte", "Ressourcen" to 0, "Bauern" to 10, "Gold" to 500, aktuelleRessourcen)
val brett = Produktionsstaetten("Sägewerk", "Ressourcen" to 0, "Bauern" to 15, "Gold" to 1000, aktuelleRessourcen)
val fisch = Produktionsstaetten("Fischerei", "Bretter" to 10, "Bauern" to 30, "Gold" to 1000, aktuelleRessourcen)
val schaf = Produktionsstaetten("Schäferei", "Bretter" to 10, "Bauern" to 15, "Gold" to 1000, aktuelleRessourcen)
val kleidung = Produktionsstaetten("Weberei", "Bretter" to 10, "Bauern" to 50, "Gold" to 2000, aktuelleRessourcen)
val kartoffeln = Produktionsstaetten("Kartoffelhof", "Bretter" to 10, "Bauern" to 25, "Gold" to 1000, aktuelleRessourcen)
val schnaps = Produktionsstaetten("Schnapsbrennerei", "Bretter" to 20, "Bauern" to 50, "Gold" to 5000, aktuelleRessourcen)
val koenig = Koenigspalast("Königspalast", "Bretter" to 50, "Gold" to 50000, "Bauern" to 1000,aktuelleRessourcen)

class Start(){

    fun spielbeginn(){

        println("""
        FAKE GAME!!!    
        Schön das du mein Fake Game spielen möchtest.
        Tippe 1 ein, um dein Ziel im Fake Game zu erfahren.
        Tippe 2 ein, um die Liste der Baumöglichkeiten einzusehen und was sie Kosten.
        Tippe 3 ein, um das Spiel zu beginnen.
        """.trimIndent())

        var userStart = readln().toInt()
        when (userStart){
            1 -> ziel()
            2 -> preisAuflistung()
            3 -> spielStart()
        }

    }

    fun ziel(){

        println("""
        Zunächst möchte ich dir das Spiel näher bringen.    
        Das hier ist eine kleine Städtebau Simulation. Dein Ziel ist es, das Königspalast zu errichten.
        Um dein Ziel zu erreichen musst du gewisse voraussetzungen erfüllen, denn
        erst wenn du genug Bauern, Gold und Ressourcen hast, kannst du das Königspalast errichten.
        """.trimIndent())
        println("Tippe X um wieder ins Menü zurückzukehren.")
        val x = readln()
        when (x){
            x -> spielbeginn()
        }
    }

    fun preisAuflistung(){

        println("""
        Hier eine auflistung der Gebäude die du Bauen kannst und was was sie dich kosten.    
        Lagerhaus: 2000 Gold und 20 Bretter.
        Bauernhaus: 500 Gold.
        Marktplatz: 1500 Gold und 15 Bretter.
        Holzfällerhütte: 500 Gold und 10 Bauern.
        Sägewerk: 1000 Gold und 15 Bauern.
        Fischerei: 1000 Gold, 10 Bretter und 30 Bauern.
        Schäferei: 1000 Gold, 10 Bretter und 15 Bauern.
        Weberei: 2000 Gold, 10 Bretter und 50 Bauern.
        Kartoffelhof: 1000 Gold, 10 Bretter und 25 Bauern.
        Schnapsbrennerei: 5000 Gold, 20 Bretter und 50 Bauern.
        Königspalast: 50000 Gold, 50 Bretter und 1000 Bauern.
        """.trimIndent())
        println("Tippe X um wieder ins Menü zurückzukehren.")
        val x = readln()
        when (x){
            x -> spielbeginn()
        }
    }

    fun spielStart(){

        println("""
        Das Spiel beginnt.    
        Zuvor ein Paar Tipps:
        Dein Bester Freund in diesem Spiel ist deine Ressourcenliste. 
        Anhand dieser kannst du ziemlich alles ablesen und deinen Nächsten schritt planen.
        Außerdem wird dir immer eine Meldung ausgegeben was dein nächster Schritt sein sollte, 
        wenn du mal etwas nicht tun kannst wie du es möchtest.
        Tippe einfach in die Konsole ein welches Gebäude du Bauen möchtest. 
        Halte dich dabei jedoch genau an die Richtige Schreibweise.
        Viel Spaß und viel Erfolg ✌️❕
        """.trimIndent())
        println()
        println("Hier deine Aktuellen Ressourcen: $aktuelleRessourcen")
        println()
        println("Gebe nun den Namen des Gebäudes ein, dass du errichten möchtest.")
        userBaubefehl(readln = "")
        println()

        repeat(1000) {
            println(aktuelleRessourcen)
            println(deineGebaeude)
            println("Welches Gebäude möchtest du errichten ?")
            userBaubefehl(readln = "")
            println()
        }





    }

    fun userBaubefehl(readln: String) {

        when (readln()) {

            "Marktplatz" -> {
                marktplatz.build(aktuelleRessourcen, deineGebaeude)
            }

            "Bauernhaus" -> {
                bauernhaus.build(aktuelleRessourcen, deineGebaeude)
            }

            "Lagerhaus" -> {
                lagerhaus.build(aktuelleRessourcen, deineGebaeude)
            }

            "Holzfällerhütte" -> {
                holz.build(aktuelleRessourcen, deineGebaeude)
            }

            "Sägewerk" -> {
                brett.build(aktuelleRessourcen, deineGebaeude)
            }

            "Fischerei" -> {
                fisch.build(aktuelleRessourcen, deineGebaeude)
            }

            "Schäferei" -> {
                schaf.build(aktuelleRessourcen, deineGebaeude)
            }

            "Weberei" -> {
                kleidung.build(aktuelleRessourcen, deineGebaeude)
            }

            "Kartoffelhof" -> {
                kartoffeln.build(aktuelleRessourcen, deineGebaeude)
            }

            "Schnapsbrennerei" -> {
                schnaps.build(aktuelleRessourcen, deineGebaeude)
            }

            "Königspalast" -> {
                koenig.build(aktuelleRessourcen, deineGebaeude)
                if (deineGebaeude["Königspalast"] != null){
                    koenig.siegesbedingung()
                    println()
                    println("Einen Augenblich bitte. Du wirst nun wieder zum Hauptmenü geleitet.")
                    Thread.sleep(2500)
                    spielbeginn()
                }

            }

            else -> {
                try {
                    Gebaeude("", "" to 0, "" to 0, "" to 0).build(aktuelleRessourcen, deineGebaeude)
                } catch (e: Exception) {
                        println("Fehler: " + e.message)
                }
                userBaubefehl(readln = "")
            }
        }
    }
}