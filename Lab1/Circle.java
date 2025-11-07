package Lab1;   // keep or remove depending on your folder setup

public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle [Color=" + getColor() +
                ", Radius=" + radius +
                ", Area=" + String.format("%.2f", getArea()) +
                ", Sides=0 (Curved Shape)]";
    }

}


