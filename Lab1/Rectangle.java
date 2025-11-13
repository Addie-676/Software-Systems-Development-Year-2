package Lab1;
public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }



    // Implementation of getArea()
    public double getArea() {
        return width * height;
    }
    public String toString() {
        return "Rectangle [Color=" + getColor() +
                ", Width=" + width +
                ", Height=" + height +
                ", Area=" + String.format("%.2f", getArea()) +
                ", Sides=4]\n";
    }

}
