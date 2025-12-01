// BruchTest.java
public class BruchTest {
    public static void main(String[] args) {
        Bruch a = new Bruch(2, 3);
        Bruch b = new Bruch(5, 4);

        // Statische Methode
        Bruch cStatic = Bruch.mult(a, b);

        // Instanz-Methode
        Bruch cInstance = a.mult(b);

        System.out.println("a = " + a);           // 2/3
        System.out.println("b = " + b);           // 5/4
        System.out.println("a * b (static) = " + cStatic);    // 10/12
        System.out.println("a * b (instance) = " + cInstance); // 10/12
    }
}

