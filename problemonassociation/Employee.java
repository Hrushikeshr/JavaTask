package problemonassociation;
import java.util.*;
public class Employee {
    private String empName;

    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName1){
        this.empName = empName1;
    }
    @Override
    public String toString(){
       return empName;
    }

}
