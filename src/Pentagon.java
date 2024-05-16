public class Pentagon extends Shape {
    private double side;

    public Pentagon(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * side;
    }
}