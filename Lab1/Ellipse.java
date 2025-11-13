package Lab1;


public class Ellipse extends Shape {
    protected double halfheight ;
    protected double halfwidth ;

    public Ellipse(double halfheight, double halfwidth) {
        this.halfheight = halfheight;
        this.halfwidth = halfwidth;
    }

    @Override
    protected double getArea() {
        return  Math.PI*halfwidth*halfheight;
    }

    @Override
    public String toString() {
        return super.toString()+"The area of the ellipse is: "+ String.format("%.2f",getArea())+"\nThe number of sides : "+getSides()+"\n\n";
    }
}