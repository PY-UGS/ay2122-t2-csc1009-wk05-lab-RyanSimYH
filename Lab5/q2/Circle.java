package Lab5.q2;

public class Circle extends Shape{

    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area()
    {
        return PI*dim1*dim2;
    }

}
