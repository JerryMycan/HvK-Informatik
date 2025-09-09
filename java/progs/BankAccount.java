/**
 * Repräsentiert ein einfaches Bankkonto mit IBAN, Inhaber und Kontostand.
 *
 * Zentrale Invarianten:
 *  - balance >= 0
 *  - iban != null/leer
 *  - owner != null/leer
 *
 * Typische Operationen:
 *  - deposit(amount): Geld einzahlen
 *  - withdraw(amount): Geld abheben (falls genug Guthaben)
 *  - transferTo(target, amount): Betrag an ein anderes Konto ueberweisen
 */
public class BankAccount {
    /** Eindeutige Konto-ID (vereinfachte IBAN-Darstellung). Unveraenderlich. */
    private final String iban;

    /** Name des Kontoinhabers. Unveraenderlich. */
    private final String owner;

    /** Aktueller Kontostand in Euro. Nie negativ. */
    private double balance;

    /**
     * Konstruktor: erzeugt ein neues Konto mit Startguthaben.
     *
     * Vorbedingungen:
     *  - iban != null und nicht leer
     *  - owner != null und nicht leer
     *  - start >= 0
     *
     * Nachbedingungen:
     *  - this.iban == iban
     *  - this.owner == owner
     *  - this.balance == start
     *
     * Seiteneffekte: keine externen; nur internes Objekt wird initialisiert.
     *
     * @param iban   Kontoidentifikation (vereinfacht)
     * @param owner  Kontoinhaber
     * @param start  Startguthaben (>= 0)
     * @throws IllegalArgumentException wenn Vorbedingungen verletzt sind
     */
    public BankAccount(String iban, String owner, double start) {
        if (iban == null || iban.isBlank()) {
            throw new IllegalArgumentException("iban must not be null/blank");
        }
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("owner must not be null/blank");
        }
        if (start < 0) {
            throw new IllegalArgumentException("start must be >= 0");
        }
        this.iban = iban;
        this.owner = owner;
        this.balance = start;
    }

    /**
     * Liefert den aktuellen Kontostand.
     *
     * Vorbedingungen: keine.
     * Nachbedingungen: keine Aenderung am Objektzustand.
     * Seiteneffekte: keine.
     *
     * @return aktueller Kontostand (>= 0)
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Zahlt einen Betrag auf das Konto ein.
     *
     * Vorbedingungen:
     *  - amount > 0
     *
     * Nachbedingungen:
     *  - balance erhoeht sich um amount
     *
     * Seiteneffekte:
     *  - interner Zustand (balance) wird geaendert
     *
     * Fehlerfaelle:
     *  - IllegalArgumentException, wenn amount <= 0
     *
     * @param amount positiver Betrag in Euro
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be > 0");
        }
        balance += amount;
    }

    /**
     * Versucht, einen Betrag vom Konto abzuheben.
     *
     * Vorbedingungen:
     *  - amount > 0
     *
     * Nachbedingungen:
     *  - Wenn genug Guthaben: balance verringert sich um amount und Rueckgabe ist true
     *  - Sonst: balance unveraendert und Rueckgabe ist false
     *
     * Seiteneffekte:
     *  - interner Zustand (balance) kann geaendert werden
     *
     * Fehlerfaelle:
     *  - keine Exceptions (validierung ueber Rueckgabewert)
     *
     * @param amount angefragter Abhebebetrag in Euro
     * @return true, wenn Abhebung erfolgte; sonst false
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > balance) {
            return false; // nicht genug Guthaben
        }
        balance -= amount;
        return true;
    }

    /**
     * Ueberweist einen Betrag von diesem Konto auf das Zielkonto.
     *
     * Vorbedingungen:
     *  - target != null
     *  - amount > 0
     *  - dieses Konto hat ausreichend Guthaben (implizit ueber withdraw)
     *
     * Nachbedingungen:
     *  - Bei Erfolg: dieses balance vermindert sich um amount, target.balance erhoeht sich um amount; Rueckgabe true
     *  - Bei Misserfolg (z. B. zu wenig Guthaben): beide Kontostaende bleiben unveraendert; Rueckgabe false
     *
     * Seiteneffekte:
     *  - kann den Zustand von zwei Objekten aendern (this und target)
     *
     * Fehlerfaelle:
     *  - IllegalArgumentException, wenn target == null oder amount <= 0
     *
     * @param target Zielkonto der Ueberweisung
     * @param amount zu ueberweisender Betrag in Euro
     * @return true bei erfolgreicher Ueberweisung; sonst false
     */
    public boolean transferTo(BankAccount target, double amount) {
        if (target == null) {
            throw new IllegalArgumentException("target must not be null");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be > 0");
        }
        // zuerst versuchen abzuheben; nur bei Erfolg auf Zielkonto einzahlen
        if (this.withdraw(amount)) {
            target.deposit(amount);
            return true;
        }
        return false; // Abhebung fehlgeschlagen -> keine Aenderung am target
    }

    // (Optional) Zugriffsmethoden fuer feste Felder, falls benoetigt:

    /**
     * Zeigt die IBAN-Nr. 
     * 
     * @return IBAN (nie null/leer)
     */
    public String getIban() {
        return iban;
    }

    /**
     * @return Inhabername (nie null/leer)
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Textuelle Darstellung fuer Debug/Protokoll (ohne sensible Daten).
     */
    @Override
    public String toString() {
        return "BankAccount{iban='" + iban + "', owner='" + owner + "', balance=" + balance + "}";
    }
}
