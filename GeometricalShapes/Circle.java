public class Circle {

    private final double PI = 3.14;
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
       this.radius = radius;
    }
    public double area() {
        double area = radius * radius * PI;
        return area;
    }
    
    public double circumference() {
        double circumference = 2 * PI * radius;
        return circumference;
    }
}
