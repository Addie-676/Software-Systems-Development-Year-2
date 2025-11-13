package Lab1;
abstract class Shape {
    private int sides;

    protected int getSides() {
        return sides;
    }
    protected void setSides(int sides) {
        this.sides = sides;
    }
    abstract protected double getArea();

    @Override
    public String toString() {
        return "Values\n";
    }

}