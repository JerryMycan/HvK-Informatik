public class PointTest{
  public static void main(String[] args){
    Point p1 = new Point(10,10); // Erzeugung von dem Punkt p1 bei (10, 10)
    Point p2 = new Point();      // Erzeugung von dem Punkt p2 bei (0, 0)
    
    System.out.println("Originalwert der beiden Punkte: ");
    
    System.out.println(p1);      // p1 wird angezeigt mit der toString-Methode
    System.out.println(p2);      // p2 wird angezeigt mit der toString-Methode
    
    System.out.println("\nDie Punkte werden verschoben zu:");
    
    p1.move(5,2);                // p1 wird +5 in der x-Achse und +2 in der y-Achse verschoben
    p2.move(2,-2);               // p2 wird +2 in der x-Achse und -2 in der y-Achse verschonen
    
    System.out.println(p1);
    System.out.println(p2);
    
    System.out.println("\nDer Abstand der beiden Punkte beträgt: \n" + p1.distance(p2));
    
    System.out.println("\nP1 wird entlang beider Achsen gespiegelt: ");
    
    System.out.print("Von P1" + p1);
    p1.mirrorX();                // p1 wird gespiegelt entlang der x-Achse
    p1.mirrorY();                // p1 wird gespiegelt entlang der y-Achse
    System.out.println(" zu P1" + p1);
    
    System.out.println("\nÜberprüfung ob P1 bei P2 ist: ");
  
    System.out.println("P1" + p1 + " " + "P2" + p2);
  
    System.out.println(p1.equals(p2)); // erste Überprufüng ob p1 bei p2 ist, mit der Ausgabe 'false'
    
    System.out.println("\nP1 wird zu P2 bewegt: ");
    
    p1.move(17,10);
    
    System.out.println("P1" + p1 + " " + "P2" + p2); 
    
    System.out.println(p1.equals(p2)); // zweite Überprüfung ob beide Punkte gleich sind, mit der Ausgabe 'true' 
  
  }
}