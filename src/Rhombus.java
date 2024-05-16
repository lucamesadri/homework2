public class Rhombus extends Shape {
    private double side;

    public Rhombus(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side * Math.sqrt(3) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}