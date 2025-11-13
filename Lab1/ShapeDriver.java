package Lab1;
public class ShapeDriver {
    public static void main(String[] args) {
        //value constructors
        Rectangle r1 = new Rectangle(10,15);
        Rectangle r2 = new Rectangle(13,20);

        //setting side values
        r1.setSides(2);
        r2.setSides(2);

        //printing values
        System.out.print(r1);
        System.out.print(r2);

        //value constructors
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(13);

        //setting side values
        c1.setSides(0);
        c2.setSides(0);

        //printing values
        System.out.print(c1);
        System.out.print(c2);

        //value constructors
        Ellipse e1 = new Ellipse(10,15);
        Ellipse e2 = new Ellipse(13,20);

        //setting side values
        e1.setSides(0);
        e2.setSides(0);

        //printing values
        System.out.print(e1);
        System.out.print(e2);
    }
}