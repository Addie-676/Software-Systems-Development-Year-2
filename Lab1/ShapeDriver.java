package Lab1;
public class ShapeDriver {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle("Red", 4.5, 3.2);
        Rectangle r2 = new Rectangle("Blue", 2.0, 6.0);
        Circle c1 = new Circle("Yellow", 3.0);
        Ellipse e1 = new Ellipse("Pink", 6.0, 4.0);
        Ellipse e2 = new Ellipse("Cyan", 10.0, 5.0);

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s %-10s %-10s\n",
                "Shape", "Color", "Width", "Height/Radius", "Area", "Sides");
        System.out.println("--------------------------------------------------------------------------");

        System.out.printf("%-10s %-10s %-10.2f %-15.2f %-10.2f %-10s\n",
                "Rectangle", r1.getColor(), r1.getWidth(), r1.getHeight(), r1.getArea(), "4");

        System.out.printf("%-10s %-10s %-10.2f %-15.2f %-10.2f %-10s\n",
                "Rectangle2", r2.getColor(), r2.getWidth(), r2.getHeight(), r2.getArea(), "4");

        System.out.printf("%-10s %-10s %-10s %-15.2f %-10.2f %-10s\n",
                "Circle", c1.getColor(), "-", c1.getRadius(), c1.getArea(), "0");

        System.out.printf("%-10s %-10s %-10.2f %-15.2f %-10.2f %-10s\n",
                "Ellipse", e1.getColor(), e1.getWidth(), e1.getHeight(), e1.getArea(), "0");

        System.out.printf("%-10s %-10s %-10.2f %-15.2f %-10.2f %-10s\n",
                "Ellipse", e2.getColor(), e2.getWidth(), e2.getHeight(), e2.getArea(), "0");

        System.out.println("--------------------------------------------------------------------------");
    }
}



