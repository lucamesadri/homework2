public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", 10, 9);
        Circle circle = new Circle("Circle", 2);
        Rhombus rhombus = new Rhombus("Rhombus", 5);
        Hexagon hexagon = new Hexagon("Hexagon", 5);
        Pentagon pentagon = new Pentagon("Pentagon", 10);

        rectangle.printDetails();
        circle.printDetails();
        rhombus.printDetails();
        hexagon.printDetails();
        pentagon.printDetails();
    }
}