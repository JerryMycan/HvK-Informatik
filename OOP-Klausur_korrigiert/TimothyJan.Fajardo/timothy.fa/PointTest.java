public class PointTest{
  public static void main(String[] args) {
    
    // Erzeugung 2 Punkte
    Point p1 = new Point(3,4);
    Point p2 = new Point(1,2);
    
    // Ausgabe 2 Punkte
    System.out.println("Punkt 1:" + p1);
    System.out.println("Punkt 2:" + p2);
    
    // Verschiebung der Punkt
    p1.move(2, -1);
    System.out.println("\nPunkt 1 nach move(2, -1):" + p1);
    
    // Distanz zwischen beiden Punkten Ausgabe
    double dist = p1.distance(p2);
    System.out.println("\nDistanz zwischen p1 und p2: " + dist);
    
    // Spiegelung mit mirrorX() und mirrorY()
    p1.mirrorX();
    System.out.println("p1 nach mirrorX(): " + p2);
    p1.mirrorY();
    System.out.println("p1 nach mirrorY(): " + p1);
    
    //Bonus Aufgabe: boolean  
    }
  }
 