public class point {
  
  private int x;
  private int y;
  
  public point(int x, int y){
    this.x = x;
    this.y = y; 
  } 
  
  // Standartkonstruktor um beide 0 zu setzten
  public point() {
    this.x = 0;
    this.y = 0;
  }
  
  // Getter und Setter Methode
  public int getx (){
    return = x;
  }
  
  public int gety(){
    return = y;
  }
  
  public void setx(int x){
    this.x = x;
  }  
  
  public void sety(int y){
    this.y = y;
  }  
  
  // Einen Punkt bewegen 
  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }  
  
  // Distanz zwischen zwei Punkten berechnen
  public double distance(Point p){
    int dx = this.x - p.x;
    int dy = this.y - p.y;  
  }
  
  // Spiegen erst and der X- Achse und danach an der Y- Achse
  public void mirrorx(){ 
    this.x = -this.x; 
  }

  public void mirrory(){ 
    this.y = -this.y;  
  }
  
  public boolean equals(Point p){
    
  
  
  
  }
  
  // Die toString Methode 
  public String toString(){
    return("Der Punkt liegt bei" + x,y +"."); 
  } 
}