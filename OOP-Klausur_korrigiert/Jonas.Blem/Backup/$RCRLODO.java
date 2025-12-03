public class Point {
  
  private int X;
  private int Y;
  double start; 
  
  Point(int X, int Y, double start) {
    
    this.X = X;
    this.Y = Y;
    this.Start = 0, 0;
  
  }
  
  public int getX(){
    
    getX = X;
    
    }
  
  public int getY(){
    
    getY = Y;
    
    }
  
  public void set(int X-Koordinate ) {
  
    this.X = X;
    
  }
  
  public void name(int Y-Koordinate) {
  
    this.Y = Y;
    
  }
  
  public void move() {
  
    int Xd = X + d;
    int Yd = Y + d;

  }
  
  public double distance(){
    
    double distance = math.sqrt((X - p * X)^2 + (Y - p * Y)^2);
    
    }
  
  public void mirrorx(){
    
    MirrorX = Y - 2*Y;
    
    } 
  
  public void mirrory() {
  
    MirrorY = X - 2*X;
    
  }
               
  
  public String toString(){
    
    "Die X-Koordinate ist:" + X-Koordinate + "\nDie Y-Koordinate ist:" + Y-Koordinate;
    
    }  
    



  }