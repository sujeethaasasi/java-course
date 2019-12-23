package overriding;

import javax.sound.midi.Soundbank;
import javax.swing.*;

class Programmer {
        String name;
        int salary;
        String role;
        int incentive;

    public Programmer(){
        this.role="Programmer-1";
        this.incentive=500;
    }
    public Programmer(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public void setEmployee(String name,int salary){
            this.name=name;
            this.salary=salary;
            this.role="Programmer";

    }
    public void getEmployee(){
                System.out.println("Employee Name : "+this.name);
                System.out.println("Employee Salary : "+this.salary);
                System.out.println("Employee Role : "+this.role);
    }
    public void getRole(){
            System.out.println(this.role);
    }
    public void getTotal(){
        int total;
        total=this.incentive+this.salary;
        System.out.println("Total salary is : "+total);
    }
    public void show(){
        System.out.println("super method");
    }
}

class Developer extends Programmer {
    String name;
    int salary;
    String role;

    public Developer(){
            super.show();
    }

    public void setEmployee(String name,int salary){
        this.name=name;
        this.salary=salary;
        this.role="Developer";

    }
    public void getEmployee(){
        System.out.println("Employee Name : "+this.name);
        System.out.println("Employee Salary : "+this.salary);
        System.out.println("Employee Role : "+this.role);
    }
//    public void getRole(){
//        System.out.println("Role : "+this.role);
//    }

//        public void empInformation(String name,String salary,String role){
//            ShowDetails objShow=new ShowDetails();
//            objShow.setDetails(name,salary,role);
//            objShow.getDetails();
//        }
}

class Coder extends Programmer {
        String name;
        int salary;
        String role;

        public void setEmployee (String name,int salary){
            this.name = name;
            this.salary = salary;
            this.role = "Coder";

        }
        public void getEmployee () {
            System.out.println("Employee Name : " + this.name);
            System.out.println("Employee Salary : " + this.salary);
            System.out.println("Employee Role : " + this.role);
        }

//            System.out.println("Employee Name : "+name);
//            System.out.println("Employee Salary : "+salary);
//            System.out.println("Employee Role : "+role);
}

class Tester extends Programmer {
            String name;
            int salary;
            String role;

            public Tester(String name,int salary){
                super(name, salary);
                this.name=name;
                this.salary=salary;
                this.role="Tester";
            }
            /*public void setEmployee(String name,int salary){
                this.name=name;
                this.salary=salary;
                this.role="Tester";
            }
            public void getEmployee(){
                System.out.println("Employee Name : "+this.name);
                System.out.println("Employee Salary : "+this.salary);
                System.out.println("Employee Role : "+this.role);
            }*/
//            System.out.println("Employee Name : "+name);
//            System.out.println("Employee Salary : "+salary);
//            System.out.println("Employee Role : "+role);
//        }
}

public class Overriding{
    public static void main(String[] args){
        Developer objDev = new Developer();//developer("Rajesh",4000,"Developer);using get & set
        objDev.setEmployee("Rajesh",4000);
        objDev.getEmployee();
        objDev.getRole();
        objDev.getTotal();

        Coder objCode = new Coder();
        objCode.setEmployee("Kumar",3000);
        objCode.getEmployee();

        Tester objTest=new Tester("sundar",2500);
//        objTest.setEmployee("Sundar",2000);
        objTest.getEmployee();
        objTest.getTotal();

        Programmer objDev1=new Developer();
        objDev1.setEmployee("xxxx",2000);
        objDev1.getEmployee();
        objDev1.getRole();
        objDev1.getTotal();
    }
}