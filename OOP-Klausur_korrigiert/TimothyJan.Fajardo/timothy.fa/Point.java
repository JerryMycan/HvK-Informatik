public class Point{ 
  
  //Attribute Etablierung
  private int x; 
  private int y;
  
  
  // Konstruktor
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  public Point(){
    this(0,0);
  }
  
  // Getter und Setter
  public int getX(){
    return x;
  }
  public void setX(int x){
    this.x = x;
  }
  
  public int getY(){
    return y;
  }
  public void setY(int y){ 
    this.y = y;
  }
  
  // dx und dy Verschiebung
  public void move (int dx, int dy){
    this.x += dx;
    this.y += dy;
  }
  
  // Distanz Berechnung, dx und dy deklarierung
  // double wurzel = Math.sqrt(zahl)
  public double distance(Point p){
    int dx = this.x - p.x;
    int dy = this.y - p.y;
    return Math.sqrt(dx*dy*dy);
  }
  
  // Spiegelung der X und Y Punkte
  public void mirrorX(){
    this.y = -this.y;
  }
  public void mirrorY(){
    this.x = -this.x;
  }
  
  // Ausgabe x und y
  @Override
  public String toString(){
    return "("+x+","+y+")";
  } 
  
  //public boolean equals(Point p)
}