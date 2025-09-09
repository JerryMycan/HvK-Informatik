// Datei: KontoApp.java
public class KontoApp {
    public static void main(String[] args) {
        // Objekt anlegen
        BankKonto konto1 = new BankKonto("001", "Tom", 0.0);

        // kleine Demo
        konto1.einzahlen(100.0);
        boolean ok = konto1.abheben(30.0);

        System.out.println("Abhebung erfolgreich? " + ok);
        System.out.println("Kontostand: " + konto1.getKontostand());
        System.out.println(konto1); // nutzt toString()
    }
}
