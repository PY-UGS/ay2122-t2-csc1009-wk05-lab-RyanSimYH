package Lab5.q2;

abstract class Shape {
    double dim1, dim2;
    double PI = 3.1416;
    public Shape(double dim1, double dim2)
    {
      this.dim1 = dim1;
      this.dim2 = dim2;
    }
    abstract double area();

}
