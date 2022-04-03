package Cylinder;

/**
 *
 * @author FAKHRI
 */
public class Circle extends Shape {
    // private instance variable, not accessible from outside this class
    private double radius;

    // 1st constructor, which sets both radius and color to default
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // 2nd constructor with given radius, but color default
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Construtor to construct a new instance of Circle with the given radius and color
    public Circle (double radius, String color) {
        this(radius);
        setColor(color);
    }

    public Circle (double radius, String color, boolean filled) {
        this(radius, color);
        setFilled(filled);
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius; 
    }

    // Setter for instance variable radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+radius
             + ", which is a subclass of "+super.toString();
    }
}
