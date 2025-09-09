/**
 * Die Klasse BankKonto modelliert ein sehr einfaches Bankkonto.
 * Sie enthaelt genau drei Attribute:
 * - iban       : eindeutige Kennung des Kontos
 * - besitzer   : Name des Kontoinhabers
 * - kontostand : aktueller Stand in Euro
 *
 * Ziel: Moeglichst einfacher Einstieg in die Modellierung.
 * Es werden absichtlich nur Grundfunktionen bereitgestellt.
 *
 * Beispiel (vereinfacht):
 * <pre>
 *   BankKonto k = new BankKonto("DE00 1234 5678 9000 00", "Max Mustermann", 100.0);
 *   k.einzahlen(50.0);      // kontostand: 150.0
 *   k.abheben(20.0);        // kontostand: 130.0 (true)
 *   System.out.println(k);  // zeigt Kurzinfo zum Konto
 * </pre>
 */
public class BankKonto {

    /** Eindeutige Konto-Kennung (IBAN). */
    private final String iban;

    /** Name des Kontoinhabers (Besitzer). */
    private String besitzer;

    /** Aktueller Kontostand in Euro. */
    private double kontostand;

    /**
     * Konstruktor: Legt ein neues einfaches Bankkonto an.
     *
     * Es findet nur eine minimale Pruefung statt:
     * - Wenn startbetrag kleiner als 0 ist, wird er auf 0 gesetzt (einfacher Einstieg).
     *
     * @param iban        IBAN des Kontos (nicht null oder leer erwartet)
     * @param besitzer    Name des Kontoinhabers (nicht null oder leer erwartet)
     * @param startbetrag Anfangsbestand in Euro (falls < 0, wird 0 gesetzt)
     */
    public BankKonto(String iban, String besitzer, double startbetrag) {
        this.iban = iban;
        this.besitzer = besitzer;
        this.kontostand = startbetrag;
    }

    /**
     * Liefert die IBAN des Kontos.
     *
     * @return IBAN-String
     */
    public String getIban() {
        return iban;
    }

    /**
     * Liefert den Namen des Kontoinhabers (Besitzer).
     *
     * @return Name des Kontoinhabers
     */
    public String getBesitzer() {
        return besitzer;
    }

    /**
     * Aendert den Namen des Kontoinhabers.
     * (Einfach gehalten, ohne weitere Pruefung.)
     *
     * @param neuerBesitzer neuer Name des Kontoinhabers
     */
    public void setBesitzer(String neuerBesitzer) {
        this.besitzer = neuerBesitzer;
    }

    /**
     * Liefert den aktuellen Kontostand in Euro.
     *
     * @return aktueller Kontostand
     */
    public double getKontostand() {
        return kontostand;
    }

    /**
     * Zahlt einen Betrag auf das Konto ein.
     * Einfache Regel: Nur positive Betraege werden angenommen.
     * Ungueltige Betraege (<= 0) werden still ignoriert.
     *
     * @param betrag Betrag in Euro (sollte > 0 sein)
     */
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
        }
        // sonst: keine Aenderung (bewusst simpel gehalten)
    }

    /**
     * Hebt einen Betrag vom Konto ab.
     * Einfache Regeln:
     * - Betrag muss > 0 sein
     * - Es darf nicht mehr abgehoben werden als vorhanden ist
     *
     * @param betrag gewuenschter Abhebebetrag in Euro
     * @return true, wenn Abhebung gelungen ist; false, wenn nicht genug Guthaben
     *         oder betrag <= 0 war
     */
    public boolean abheben(double betrag) {
        if (betrag <= 0) {
            return false;
        }
        if (betrag > kontostand) {
            return false;
        }
        kontostand -= betrag;
        return true;
    }

    /**
     * Gibt eine kurze, lesbare Darstellung des Kontos zurueck.
     * (Nur zur Anzeige/Fehlersuche gedacht.)
     *
     * @return String mit IBAN, Besitzer und Kontostand
     */
    @Override
    public String toString() {
        return "BankKonto{iban='" + iban + "', besitzer='" + besitzer
                + "', kontostand=" + kontostand + "}";
    }
}
