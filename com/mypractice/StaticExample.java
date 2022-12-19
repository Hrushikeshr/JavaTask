import java.util.Scanner;

//Java Program to demonstrate the use of static variable
class Student{
    int rollno;//instance variable
    String name;
     static String college ="ITS";//static variable
    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}


}


public class StaticExample {

    static void m1(){
        System.out.println("Hi Hrushikesh!");
    }

    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println(sum(5,6));
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        //we can change the college of all objects by the single line of code
        Student.college="BBDIT";
        s1.display();
        s2.display();
        m1();
    }
}
