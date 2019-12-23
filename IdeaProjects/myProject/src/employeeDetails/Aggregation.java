package employeeDetails;

public class Aggregation {
    public static void main(String args[]){

        Role objHR = new Role("HR",4500);
        Role objTechnology = new Role("Technology",3000);

        Employee obj = new Employee("Siva",objHR);
        Employee obj1 = new Employee("Sundar",objTechnology);

        obj.getDetails();
        obj1.getDetails();
    }

}
