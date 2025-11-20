# Trainingsdaten

Aufgabenstellung:

Frau Hofer geht mehrmals pro Woche laufen. Mit Hilfe einer GPS-Uhr zeichnet sie für jeden Lauf die zurückgelegte Distanz und die benötigte Zeit auf. Alle paar Wochen liest Frau Hofer die aufgezeichneten Daten aus der Uhr in eine Textdatei aus, um ihre Trainingsdaten auszuwerten. Der Aufbau der Textdatei ist jedoch unübersichtlich und für Frau Hofer schwer zu lesen.

Implementieren Sie ein Programm, das diese Textdatei einliest und in lesbarer Form am Bildschirm ausgibt. Die Textdatei kann mehrere Zeilen enthalten. Jede Zeile enthält die Aufzeichnungen für eine Woche. Die erste Zahl einer Zeile ist die Anzahl der aufgezeichneten Trainingsläufe. Anschließend folgt paarweise die zurückgelegte Distanz in km und die gelaufene Zeit in min.

Lesen Sie die Trainingsdaten ein und berechnen Sie, pro Woche sowie für die gesamte Datei, folgende Kennzahlen:
• Gesamte zurückgelegte Distanz in km
• Durchschnittliche Distanz pro Lauf in km
• Durchschnittliche Laufgeschwindigkeit in min/km

Hinweise:
• Sie können davon ausgehen, dass die Datei TrainingRecords.txt das beschriebene Format hat; eine Fehlerbehandlung ist nicht erforderlich.
Anzahl der Läufe pro Woche
km
min
• Falls in einer Woche keine Trainingsdaten aufgezeichnet wurden, steht am Beginn der Zeile eine 0.
• Es werden nur Trainingsläufe gespeichert, bei denen die Distanz ≥ 1 Kilometer ist.
• Verwenden Sie für die Berechnungen ausschließlich den Datentyp int und geben Sie die Ergebnisse auf eine Kommastelle gerundet aus.
• Sie können die Klassen In und Out verwenden, um Werte aus der Datei einzulesen.
