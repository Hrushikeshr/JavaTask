public class CreatingClass {

    int rollNo;
    String name;
    public  CreatingClass(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
    }
    public  String toString(){
        return  name + ","+ rollNo;

    }
    public static void main(String[] args) {
        System.out.println("hh");
        CreatingClass s1 = new CreatingClass(45, "Armpit");
        CreatingClass s2 = new CreatingClass(35, "Rahul");
        System.out.println(s1);
        System.out.println(s2);

    }
}
