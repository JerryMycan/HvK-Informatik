 import java.lang.Math;
public class PointTest{
  public static void main(String[]args) {
    Point punkt1 = new Point(1,2);
    Point punkt2 = new Point(2,1);
    
    punkt1.setXKoordinate(5);
    punkt1.setYKoordinate(3);
    punkt2.setXKoordinate(3);
    punkt2.setYKoordinate(5);
    punkt1.Anzeigen();
    punkt2.Anzeigen();
    punkt1.mirrorX();
    punkt1.mirrorY();
    punkt1.move(2,3);
    }
  }