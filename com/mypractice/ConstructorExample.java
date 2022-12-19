
public class ConstructorExample {
    int num;
    String name;
    ConstructorExample(int num, String name){
        this.num = num;
        this.name = name;
    }

    ConstructorExample(ConstructorExample s){
        this.num = s.num;
        this.name = s.name;
    }

    void display(){
        System.out.println(num + " "+ name);
    }

    public static void main(String[] args) {
        ConstructorExample s1 = new ConstructorExample(5, "Raja");
        ConstructorExample s2 = new ConstructorExample(s1);
        s1.display();
        s2.display();
    }
}
