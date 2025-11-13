package Lab1;


public class Rectangle extends Shape {
     protected double height ;
     protected double width ;

     public Rectangle(double height, double width) {
         this.height = height;
         this.width = width;
     }

    @Override
    protected double getArea() {
        return  height * width;
    }

    @Override
    public String toString() {
        return super.toString()+"The area of the rectangle is: "+ getArea()+"\nThe number of sides :"+getSides()+"\n\n";
    }
}