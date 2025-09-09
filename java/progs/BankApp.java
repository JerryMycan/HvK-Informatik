/**
 * BankApp: kleines Testprogramm fuer die Klasse BankAccount.
 * Testet: Konstruktor, Getter, deposit, withdraw, transferTo, toString,
 * sowie Fehlerszenarien (Exceptions / false-Rueckgaben).
 */
public class BankApp {

    public static void main(String[] args) {
        section("1) Konten anlegen (Konstruktor testen)");
        // Legt drei Konten mit Startguthaben an
        BankAccount acc1 = new BankAccount("DE11 0000 0000 0000 0001", "Alice",   1000.00);
        BankAccount acc2 = new BankAccount("DE11 0000 0000 0000 0002", "Bob",      500.00);
        BankAccount acc3 = new BankAccount("DE11 0000 0000 0000 0003", "Charlie",    0.00);

        // Getter + toString pruefen
        printAccount("acc1 (Getter + toString)", acc1);
        System.out.println("IBAN:  " + acc1.getIban());
        System.out.println("Owner: " + acc1.getOwner());
        System.out.println("Balance ueber Getter: " + acc1.getBalance());
        System.out.println();

        section("2) Einzahlen (deposit) testen");
        // Gueltige Einzahlungen
        System.out.println("acc1.deposit(200.00)  // OK");
        acc1.deposit(200.00);
        System.out.println("acc3.deposit(300.00)  // OK");
        acc3.deposit(300.00);

        // Ungueltige Einzahlung (<= 0) -> IllegalArgumentException
        try {
            System.out.println("acc2.deposit(-5.00) // erwartet: Exception");
            acc2.deposit(-5.00);
        } catch (IllegalArgumentException ex) {
            System.out.println("   -> Exception gefangen: " + ex.getMessage());
        }
        printAll(acc1, acc2, acc3);

        section("3) Abheben (withdraw) testen");
        // Gueltiger Betrag und genug Guthaben -> true
        System.out.println("acc2.withdraw(120.00) -> " + acc2.withdraw(120.00) + "  // sollte true sein");
        // Zu hoher Betrag -> false
        System.out.println("acc3.withdraw(1000.00) -> " + acc3.withdraw(1000.00) + "  // sollte false sein");
        // Betrag <= 0 -> false
        System.out.println("acc1.withdraw(0.00) -> " + acc1.withdraw(0.00) + "       // sollte false sein");
        printAll(acc1, acc2, acc3);

        section("4) Ueberweisen (transferTo) testen");
        // Erfolgreiche Ueberweisung
        System.out.println("acc1.transferTo(acc2, 300.00) -> " + acc1.transferTo(acc2, 300.00) + "  // true erwartet");
        // Fehlgeschlagene Ueberweisung (zu wenig Guthaben)
        System.out.println("acc2.transferTo(acc3, 1000.00) -> " + acc2.transferTo(acc3, 1000.00) + " // false erwartet");
        // Ungueltiger Betrag -> Exception
        try {
            System.out.println("acc1.transferTo(acc3, -20.00) // erwartet: Exception");
            acc1.transferTo(acc3, -20.00);
        } catch (IllegalArgumentException ex) {
            System.out.println("   -> Exception gefangen: " + ex.getMessage());
        }
        // Null-Ziel -> Exception
        try {
            System.out.println("acc1.transferTo(null, 10.00) // erwartet: Exception");
            acc1.transferTo(null, 10.00);
        } catch (IllegalArgumentException ex) {
            System.out.println("   -> Exception gefangen: " + ex.getMessage());
        }
        printAll(acc1, acc2, acc3);

        section("5) Invarianten-Check (balance >= 0)");
        checkNonNegative(acc1);
        checkNonNegative(acc2);
        checkNonNegative(acc3);
        System.out.println("Alle Kontostaende sind nicht negativ. OK.");

        section("6) Abschluss");
        System.out.println("Finale Kontostaende:");
        printAll(acc1, acc2, acc3);
        System.out.println("Tests abgeschlossen.");
    }

    // ---------- Hilfsmethoden ----------

    /** Druckt eine Abschnittsueberschrift. */
    private static void section(String title) {
        System.out.println();
        System.out.println("==================================================");
        System.out.println(title);
        System.out.println("==================================================");
    }

    /** Druckt Kurzinfos zu einem Konto (nutzt toString). */
    private static void printAccount(String label, BankAccount acc) {
        System.out.println(label + ": " + acc);
    }

    /** Druckt alle drei Konten in einer kompakten Uebersicht. */
    private static void printAll(BankAccount a, BankAccount b, BankAccount c) {
        System.out.println();
        System.out.println("Status:");
        System.out.println("  A: " + a);
        System.out.println("  B: " + b);
        System.out.println("  C: " + c);
        System.out.println();
    }

    /** Prueft einfache Klasseninvariante: Kontostand darf nicht negativ sein. */
    private static void checkNonNegative(BankAccount acc) {
        if (acc.getBalance() < 0) {
            throw new AssertionError("Balance negative fuer Konto: " + acc);
        }
    }
}
