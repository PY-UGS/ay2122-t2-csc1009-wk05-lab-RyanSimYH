package Lab5.q1;

public class Circle extends GeometricObject{
    private double radius;

    public Circle()
    {}

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    public double getDiameter()
    {
        return 2*radius;
    }

    public void printCircle() {
        System.out.println("A Circle was created on "+getDateCreated()+"\nThe color is "+getColor()+"\nThe radius is "+getRadius()+"\nThe area is "+getArea()+"\nThe diamenter is "+getDiameter());
    }
}
