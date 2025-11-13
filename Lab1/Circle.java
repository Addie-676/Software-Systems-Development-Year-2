package Lab1;


public class Circle extends Shape {
    protected double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return 3*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return super.toString()+"The area of the circle is: "+ String.format("%.2f",getArea())+"\nThe number of sides : "+getSides()+"\n\n";
    }
}