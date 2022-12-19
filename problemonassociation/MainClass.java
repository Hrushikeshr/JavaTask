package problemonassociation;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        Company com = new Company();
        com.setCompName("Techouts");

        Employee emp = new Employee();
        emp.setEmpName("Hrushikesh");
        Employee emp2 = new Employee();
        emp2.setEmpName("Rajesh");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp2);

        com.setCompany(employeeList);

        System.out.println(com.getEmpList()+ " are the employee of the company "+ com.getCompName());
    }
}
