package Lab1;

public class Ellipse extends Rectangle {

    public Ellipse(String color, double width, double height) {
        super(color, width, height);
    }

    @Override
    public double getArea() {
        return Math.PI * (getWidth() / 2) * (getHeight() / 2);
    }
    public String toString() {
        return "Ellipse [Color=" + getColor() +
                ", Width=" + getWidth() +
                ", Height=" + getHeight() +
                ", Area=" + String.format("%.2f", getArea()) +
                ", Sides=0 (Curved Shape)]";
    }
}

