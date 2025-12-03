public class Pointtest{
  public static void main(String[] Args) {
  
    point po = new point();
    
    //Hier werden die X und Y Koordinaten gesettet
    po.setX(10);
    po.setY(15);
    
    //Hier werden die Getter abgefragt und ausgegeben
    System.out.println("Der Punkt hat die X Koordinate: " + po.getX() + "Der Punkt hat die Y Koordinate: " + po.getY());
    
    //Hier werden die Methoden ausgeführt 
    
    po.move();
    
    System.out.println(po);
    
    po.distance();
    
    System.out.println(po);
    
    po.mirrorx();
    
    po.mirrory();
    
    System.out.println(po);
    
    
        
    
    
    
    
    
    
  }
  }
