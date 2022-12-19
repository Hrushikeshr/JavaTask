
abstract class Shape
{
    int b = 20;

    abstract public void calculateArea();
}

public class ExampleOfAbstract extends Shape{

    public static void main(String args[])
    {
        ExampleOfAbstract obj = new ExampleOfAbstract();
//        obj.b = 200;
        obj.calculateArea();
    }

    public void calculateArea()
    {
        System.out.println("Area is " + (b * b));
    }
}
