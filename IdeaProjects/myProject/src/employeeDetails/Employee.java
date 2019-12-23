package employeeDetails;

import javax.naming.Name;

public class Employee {
    String name;
    Role employee;

    public Employee(String name,Role role) {
        this.name = name;
        employee=role;
    }
    public void getDetails(){
        System.out.println("Name : " + name);
        System.out.println("Department : " + employee.name);
        System.out.println("Salary : " + employee.salary);
    }


}
