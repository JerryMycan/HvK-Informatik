public class Point{
  
  // Attribute
  
  private int x; // x-Koordinate
  private int y; // y-Koordinate
  
  // Konstruktoren
  
  Point(int x, int y){ // Konstruktor mit gegebener x-Koordinate und y-Koordinate
    this.x = x;
    this.y = y;
  }
  
  Point(){ // Konstruktor ohne gegebenen Koordinaten
    x = 0;
    y = 0;
  }
  
  // Methoden
  
  // Getter- und Setter-Methoden
  
  public int getX(){ // x Ausgeben
    return x;
  }
  
  public int getY(){ // y Ausgeben
    return y;
  }
  
  
  public void setX(int x){ // x Ändern / Wert setzen
    this.x = x;
  }
  
  public void setY(int y){ // y Ändern / Wert setzen
    this.y = y;
  }  
  
  // Weitere Methoden
  
  public void move(int dx, int dy){ // Verschiebung um eine gegebe Koordinate
    x += dx;
    y += dy;
  }
  
  public double distance(Point p){ // Den Abstand von zwei Punkten zueinander bestimmen
    return Math.sqrt( Math.pow((x-p.x), 2) + Math.pow((y-p.y), 2) );
  }
  
  public void mirrorX(){ // Entlang der x-Achse spiegeln, also y zu -y
    y = -y;
  }
  
  public void mirrorY(){ // Entlang der y-Achse spiegeln, also x zu -x
    x = -x;
  }
  
  public boolean equals(Point p){ // Überprüfen ob beide Punkte am gleichen Ort sind
    if (x == p.x && y == p.y) {
      return true;
    }else {
      return false; 
     }
  }
  
  // toString
  
  public String toString(){ // Ausgabe von dem Punkt in dem (x, y)-Format
    return "(" + x + ", " + y + ")";
  }
}