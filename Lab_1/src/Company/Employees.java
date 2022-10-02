/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;
import java.util.ArrayList;
/**
 *
 * @author srikr
 */
public class Employees {
    private ArrayList<Employee> Employees;
    
    public Employees(){
        Employees = new ArrayList<Employee>();
    }
    
    public ArrayList<Employee> getEmployees() {
        return Employees;
    }
    
    public void setEmployees(ArrayList<Employee> Employees) {
        this.Employees = Employees;
    }
    
    public Employee addEmployee(){
        Employee es = new Employee();
        Employees.add(es);
        return es;
    }
    
    public void deleteEmployee(Employee e){
        Employees.remove(e);
    }
}
