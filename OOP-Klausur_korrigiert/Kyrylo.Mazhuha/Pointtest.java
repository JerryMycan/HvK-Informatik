public class Pointtest{
       public static void main(String[] args){
         Point point1 = new Point(10,2); // Erzeugung von dem ersten Punkt
         Point point2 = new Point() ;     // Erzeugung von dem zweiten Punkt
         System.out.println(point1);     // Ausgabe von dem ersten Punkt
         System.out.println(point2);     // Ausgabe von dem zweiten Punkt
         point1.move(10,23);             // Verschiebung von dem ersten Punkt
         System.out.println(point1);     // Ausgabe von dem erstem Punkt nach der Verschiebung
         double Ergebniss;               // Erzegung einer Variable fürs Ergebniss
         Ergebniss = point1.distance(point2);       // Zuweisung des Werts von der Methode "distance()"
         System.out.println("Die Distanz zwischen 2 Punkten ist: " + Ergebniss);     // Ausgabe des Ergebnis
         point1.mirrorX();               // Spiegelung an der X-Achse von dem ersten Punkt
         point1.mirrorY();               // Spiegelung an der Y-Achse von dem ersten Punkt
         System.out.println(point1);     // Ausgabe von dem ersten Punkt nach den Spiegelungen
         
         }
  }