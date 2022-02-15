package Lab5.q2;

public class Triangle extends Shape
{

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return (dim1*dim2)/2;
    }
}
