package Lab5.q2;

public class Rectangle extends Shape{
    public Rectangle(double dim1, double dim2)
    {
        super(dim1,dim2);
    }

    double area()
    {
        return dim1*dim2;
    }
}
