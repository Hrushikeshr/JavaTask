import java.util.Scanner;

class Person1{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}

public class GetterSetter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.next();
        Person1 ob = new Person1();
        ob.setName(name);
        System.out.println("Hey "+ob.getName()+ " Welcome to Techouts!");

    }
}
