public class Point {
  
  private double Y;
  private double X;
  private int Nullstelle;
  private double Koordinate;
  private double PunktX;
  private double PunktY;
  
  Point(double X, double Y)   {
    
    this.X = X;
    this.Y = Y;
    this.Nullstelle = 0;
    
  }
  
  
  get X(double X, int Nullstelle) {
    
    return.double X-Wert = X-Wert;  
    
  }
  
  
  get Y(double Y, int Nullstelle) {
    
    return.double Y-Wert = Y-Wert;  
    
  }
  
  set X(double X, int Nullstelle) {
    
    this.double X-Wert = X-Wert ;
    
  } 
  
  set Y(double Y, int Nullstelle) {
    
    this.double Y-Wert = Y-Wert    ;
    
  } 
  
  public void move (double X, double Y)   {
    
    
    
  }
  
  public void mirrorX(double X) {
    if (X > 0){    
      X - 2*X ;       
      System.out.println("Der angegebene X-Wert war negativ und wurde nun gespieglet");
      
      if (X < 0){
        X + 2*X;
        System.out.println("Der angegebene X-Wert war positiv und wurde nun gespieglet")  ;
        
      } 
      else {
        
        System.out.println("Der angegebene X-Wert beträgt 0 und bleibt bei einer Spiegelung gleich") ;
        
      }
    } 
  }
  
  
   
  
  public void mirrorY(double Y) {
    if (Y > 0){    
      Y - 2*Y ;       
      System.out.println("Der angegebene Y-Wert war negativ und wurde nun gespiegelt");
      
      if (Y < 0){
        Y + 2*Y;
        System.out.println("Der angegebene Y-Wert war positiv und wurde nun gespieglet")  ;
        
      } 
      
      else {
        
        System.out.println("Der angegebene Y-Wert beträgt 0 und bleibt bei einer Spiegelung gleich") ;
        
      }
    } 
  }
  
  // Math.sqrt((X-p.X)^2 + (Y+p.Y)^2)
  
  public String toString(double Koordinate, double X, double Y) {
    
    @Override;
    return Koordinate { "(" + X "/" + Y ")" } ;
    
  }
  
  public double distanceX(double X, double PunktX) {
    
    if (PunktX < 0 ) {                              
      
      X - PunktX ;
      
    }  
    
    
  } 
  
  
  public double distanceY(double Y, double PunktY) {
    
    if (PunktY < 0 ) {                              
      
      Y - PunktY ;
      
    }  
    
    
  }       
}
    
    
    
    
    
  