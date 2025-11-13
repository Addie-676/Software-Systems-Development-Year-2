package Lab1;
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
//getter and settera
    public String getColor() {
        return color;
    }

    public abstract double getArea();
}
