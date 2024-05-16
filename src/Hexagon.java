public class Hexagon extends Shape {
    private double side;

    public Hexagon(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 3 * Math.sqrt(3) * side * side / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * side;
    }
}