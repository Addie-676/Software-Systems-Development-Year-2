package Lab1;
public class ShapeDriver {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle("Red", 4.5, 3.2);
        Rectangle r2 = new Rectangle("Blue", 2.0, 6.0);
        Circle c1 = new Circle("Yellow", 3.0);
        Ellipse e1 = new Ellipse("Pink", 6.0, 4.0);
        Ellipse e2 = new Ellipse("Cyan", 10.0, 5.0);

       System.out.println(r1);
       System.out.println(r2);
       System.out.println(c1);
       System.out.println(e1);
       System.out.println(e2);
    }
}



