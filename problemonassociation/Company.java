package problemonassociation;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String compName;
    List<Employee> empList;

    public String getCompName(){
        return compName;
    }
    public void setCompName(String compName1){
        this.compName = compName1;
    }
    public List<Employee> getEmpList(){
        return empList;
    }
    public void setCompany(List<Employee> employees){
        this.empList = employees;
    }
}
