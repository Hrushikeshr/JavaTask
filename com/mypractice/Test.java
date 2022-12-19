public class Test {

//    public void m1(String s) {
//        System.out.println("String Version");
//    }
//
//    public void m1(Object o) {
//        System.out.println("Object Version");
//    }
//
//    public static void main(String arg[]) {
//        Test t = new Test();
//        t.m1("raju"); // -> String Version
//        t.m1(new Object());// -> Object Version
//        t.m1(null);
//    }

    int i;
    public Test(int i) {
        this.i = i;
    }
    @Override
    public int hashCode() {
        return i;
    }
    @Override
    public String toString() {
        return i+" ";
    }
    public static void main(String[] args) {
        Test t1=new Test (10);
        Test t2=new Test (100);
        System.out.println(t1);
        System.out.println(t2);
    }
}
