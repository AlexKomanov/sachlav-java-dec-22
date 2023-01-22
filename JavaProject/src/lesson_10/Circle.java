package lesson_10;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    /**
     * Method calculates area
     * @return calculated area of the shape.
     */
    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius * Math.PI * 2;
    }
}
