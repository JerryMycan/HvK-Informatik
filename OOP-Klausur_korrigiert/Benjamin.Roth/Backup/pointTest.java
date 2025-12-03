public class  pointTest{
  public static void main pointTest(){
    // Zwei Punkte erzeugen
    point p1 = new point(2, 3);
    point p2 = new point(1, 2);
    
    System.out.println("p1 =" + p1 );
    System.out.println("p2 =" + p2 );
    
    // Einen Punkt verschieben
    p1.move(2, 3);
    System.out.println("p1 nach move(2, 3):" + p1);
    
    // Die Ditsnaz zwischen den Punkten berechnen
    double.dist = p1.distance(p2);
    System.out.println("Distanz zwischen p1 und p2:" + dist);
    
    // Spiegelung an der X- Achse
    p1.mirrorx();
    System.out.println("p1 nach mirrorx:" + p1);
    
    
    
  }

}