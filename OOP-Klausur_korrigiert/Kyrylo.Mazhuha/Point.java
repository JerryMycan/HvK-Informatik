import java.lang.Math;                                 // import von der Math-Bibliothek

public class Point{                                    // Erzeugung von dem Class Point
       private int x;                               // X Koordinate
       private int y;                               // Y Koordinate
Point(int x, int y){                                   // Konstruktor für den Class Punkt
  this.x = x;                                          // Zuweisung von x-Wert aus dem Parameter dem Objekt
  this.y = y;                                          // Zuweisung von y-Wert aus dem Parameter dem Objekt
  }                                                    // Zweiter Konstrukter für einen Punkt ohne Anfangwerten 
Point(){
  x = 0;
  y = 0;
  }
public void setX(int neux){                             // Set-Methode für x
   x = neux;                                            // Dem vorherigen Wert x wird neurer Wert zugewiesen
  }
public void setY(int neuy){                             // Set-Methode für y
   y = neuy;                                            // Dem vorherigen Wert y wird neurer Wert zugewiesen
  }
 public int getX(){                                     // Getter-Metode für x-Wert
   return x;                                              
   }
 public int getY(){                                     // Getter-Metode für y-Wert
    return y;
   }
  public void move(int x, int y){                       // Move-Methode für die Bewegung eines ausgewählten Punktes
     this.x += x;
     this.y += y;
    }                                                   // Distance-Methode für die Berechnung vom Abstand zwischen 2 Punkten
  public double distance(Point a){       
    double wurzel;
    
    wurzel = Math.sqrt(Math.pow(x-a.x,2)+Math.pow(y-a.y,2));
    return wurzel;
    }                                                   
  public void mirrorX(){                                // MirrorX-Methode für die Spiegelung von Y-Koordinate
         y = y*-1;                                      // Die Y-Koordinate wird mit -1 multipliziert um die Spiegelung durchzuführen
    }
  public void mirrorY(){                                // MirrorY-Methode für die Spiegelung von X-Koordinate
         x = x*-1;                                      // Die X-Koordinate wird mit -1 multipliziert um die Spiegelung durchzuführen
    }
  @Override
  public String toString(){                             // toString-Methode um den Punkt im Format "(x, y)" zurückzugeben
         return "("+x+", "+y+")";
    }
  public boolean equal(Point a, Point b){
    boolean gleich false;
       
     if (a.x == b.x && a.y == b.y) {
       vergleich = true;
      System.out.println("Punkte sind gleich");
     } // end of if
      else {
        vergleich false;
      System.out.println("Punkte sind nicht gleich");
      } // end of if-else
    }
}