public class Point {
  private int x;
  private int y;
  
  // Konstruktor
  
  Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  
  public void anzeigen(){
    System.out.println("Dein Punkt ist P(" + x + "," + y + ")");
  }
  
  // Getter
  
  public int getX(){
    return x;
  }
  
  public int getY(){
    return y;
  }
  
  // Setter
  
  public void setX(int x){
    this.x = neueX;
  }
  
  public void setY(int y){
    this.y = neueY;
  }
  
  // Methoden  
  
  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }
  
  public double distance(Point p) {
    Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
  }
  
  public void mirrorX() {
    this.y = -y;
  }
  
  public void mirrorY() {
    this.x = -x;
  }
  
  // Override
  
  public String toString(){
    System.out.println("Dein Punkt ist P(" + x + "," + y + ")");
  }
}