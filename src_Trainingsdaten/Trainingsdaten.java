public class Trainingsdaten {

    // Hilft uns die Zahlen mit "." dazwischen  zu trennen --> 138 wird dann z.B. 13.8
    static String OneDecimalFormel(int tenths) {
        int ganzeZahl = tenths / 10;
        int dezimal = Math.abs(tenths % 10);
        return ganzeZahl + "." + dezimal;
    }


public static void main(String[] args) {
    Out.println("Trainingsauswertung");
    Out.println("-------------------------------------------------------------------------------");

    // "txt-Datei öffnen"
    In.open("Uebung3/TrainingRecords.txt");

    // Startwerte für unsere Variablen setzen
    int totalRuns = 0;
    int totalKm   = 0;
    int totalMin  = 0;
    int week = 1;



    int nrRuns = In.readInt(); // Anzahl an Läufen in 1. Woche

    while (In.done()) { // wir machen Schleife bis zum Ende der txt-Datei
        int weekKm  = 0;
        int weekMin = 0;

        Out.println("Woche " + week + ":");

        if (nrRuns == 0) {
            Out.println("  Keine Läufe"); //Wenn nrRuns == 0, geben wir „Keine Läufe“aus
        } else { // ansonsten lesen wir die Werte km und min aus
            for (int i = 0; i < nrRuns; i++) {
                int km  = In.readInt();
                int min = In.readInt();
                weekKm  += km;
                weekMin += min;
            }

            // Wochenwerte ausgeben
            Out.println("  Gesamte Distanz: " + weekKm + " km");

            // Durchschnittlichen km pro Lauf (1 Nachkommastelle)
            int avgDistWeek = (weekKm * 10 + nrRuns / 2) / nrRuns;
            Out.println("  Durchschnittl. Distanz pro Lauf: " + OneDecimalFormel(avgDistWeek) + " km");

            // Durchschnittliche Geschwindigkeit (min/km) --> nur wenn km > 0
            if (weekKm > 0) {
                int avgGeschwWeek = (weekMin * 10 + weekKm / 2) / weekKm;
                Out.println("  Durchschnittl. Laufgeschwindigkeit: " + OneDecimalFormel(avgGeschwWeek) + " min/km");
            } else {
                Out.println("  Durchschnittl. Laufgeschwindigkeit: -");
            }

            // Gesamtsummen erhöhen
            totalRuns += nrRuns;
            totalKm   += weekKm;
            totalMin  += weekMin;
        }

        Out.println();

        // für nächste Woche
        nrRuns = In.readInt();
        week++;
    }

    In.close();

    // Gesamtergebnis ausgeben
    Out.println("Gesamtergebnis:");
    Out.println("  Gesamte Distanz: " + totalKm + " km");

    if (totalRuns > 0) {
        int avgDistTotal = (totalKm * 10 + totalRuns / 2) / totalRuns;
        Out.println("  Durchschnittl. Distanz pro Lauf: " + OneDecimalFormel(avgDistTotal) + " km");
    } else {
        Out.println("  Durchschnittl. Distanz pro Lauf: -");
    }

    if (totalKm > 0) {
        int avgGeschwTotal = (totalMin * 10 + totalKm / 2) / totalKm;
        Out.println("  Durchschnittl. Laufgeschwindigkeit: " + OneDecimalFormel(avgGeschwTotal) + " min/km");
    } else {
        Out.println("  Durchschnittl. Laufgeschwindigkeit: -");
    }
}
}
