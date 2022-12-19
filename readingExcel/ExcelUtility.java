package readingExcel;
import java.io.*;
import java.util.Scanner;

public class ExcelUtility {
    Scanner sc = new Scanner(System.in);
    public void writeExcelData(){
        try {


            File f = new File("EmpDetail.xlxs");
            f.createNewFile();

            FileWriter fw = new FileWriter(f, true);

            System.out.println("Enter emp id ");
            int empid = sc.nextInt();

            fw.write(empid);
            sc.nextLine();
            System.out.println("write employee name");
            String name = sc.nextLine();

            fw.write(name);
            f.setReadOnly();
            fw.flush();
            fw.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ExcelUtility exu = new ExcelUtility();
    }
}
