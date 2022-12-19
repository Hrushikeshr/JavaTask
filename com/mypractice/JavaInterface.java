interface Pet
{
    public void test();
}

public class JavaInterface implements Pet {

    public void test()
    {
        System.out.println("Interface Method Implemented");
    }

    public static void main(String args[])
    {
        Pet p = new JavaInterface();
        p.test();
    }

}
