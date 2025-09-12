public class SmartphoneTest {
    public static void main(String[] args) {
        // Neues Smartphone-Objekt erzeugen
        Smartphone handy = new Smartphone(85, true);

        // Attribute ausgeben
        handy.anzeigen();
        handy.akku = 50;
        handy.anzeigen();
    }
}
