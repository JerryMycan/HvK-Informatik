// Bruch.java
public class Bruch {
    // --- Attribute (gekapselt) ---
    private int zaehler;
    private int nenner;

    // --- Konstruktoren ---
    public Bruch(int zaehler, int nenner) {
        setZaehler(zaehler);
        setNenner(nenner); // validiert: Nenner != 0
    }

    public Bruch() {
        this(0, 1);
    }

    // --- Getter / Setter ---
    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        if (nenner == 0) {
            throw new IllegalArgumentException("Nenner darf nicht 0 sein.");
        }
        this.nenner = nenner;
    }

    // --- toString für lesbare Ausgabe ---
    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }

    // --- Multiplikation (statisch): Bruch c = Bruch.mult(a, b);
    public static Bruch mult(Bruch b1, Bruch b2) {
        if (b1 == null || b2 == null) {
            throw new IllegalArgumentException("Brüche dürfen nicht null sein.");
        }
        return new Bruch(b1.zaehler * b2.zaehler, b1.nenner * b2.nenner);
    }

    // --- Multiplikation (Instanz): Bruch c = a.mult(b);
    public Bruch mult(Bruch anderer) {
        if (anderer == null) {
            throw new IllegalArgumentException("Bruch darf nicht null sein.");
        }
        return new Bruch(this.zaehler * anderer.zaehler, this.nenner * anderer.nenner);
    }
}

