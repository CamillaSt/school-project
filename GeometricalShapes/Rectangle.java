public class Rectangle {
    private double shortSide;
    private double longSide;

public Rectangle(double shortSide, double longSide) {
    this.shortSide = shortSide;
    this.longSide = longSide;
    }
    
public double getShortside() {
    return shortSide;
    }
    
public void setShortside(double kortSida) {
    shortSide = kortSida;
    }
    
public double getLongside() {
    return longSide;
    }
    
public void setLongside(double longSide) {
    this.longSide = longSide;
    }
    
public double area() {
    double area = shortSide * longSide;
        return area;
    }
    
public double circumference() {
    double circumference = shortSide + longSide + shortSide + longSide;
        return circumference; 
    }
}
