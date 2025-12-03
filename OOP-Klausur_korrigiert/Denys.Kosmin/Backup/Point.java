public class Point{
    public int x;
    public int y;
     
    public Point(int x, int y){
        this.x = x;
        this.y = y ;
    }
      
    public int getX(){
        return x;      
    }
  
    public void setX(){
        this.x = x;
    }
  
      public int getY(){
        return y;      
    }
  
    public void setY(){
        this.y = y;
    }
      
    public void anzeigen(){
        System.out.println("Der Punkt x: " + x);
        System.out.println("Der Punkt y: " + y); 
    }
  
    public void move(int dx, int dy){
        int x = (dx.x);
        int y = (dy.y);
    System.out.println("Punkt x ist an: " + dx.x + "verschiebt");
    System.out.println("Punkt y ist an: " + dy.y + "verschiebt");
    }
  
      public double distance(int x1, int y1){
        double distance1 = Math.pow(x-x1);
        double wurzel = Math.sqrt(distance1);
        double distance2 = Math.pow(y-y1);
        double wurzel1 = Math.sqrt(distance2);
        double distance3 = (distance1 + distance2); 
        System.out.println("Distanz ist: " + distance3);    
    }
  
  @Override 
  public String toString(){
     return "(x,y)";
    }
                
}