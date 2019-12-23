package Overloading;
    class SalaryCalculation {
        static void add(int basic, int additional) {
            int total=basic+additional;
            System.out.println("Employee salary is " + Integer.toString(basic+additional));
            }
        static void add( int basic, int additional,String name) {
            System.out.println(name + " salary is " + Integer.toString(basic+additional));
//        return basic+additional;
        }
    }
    public class Overloading1 {
        public static void main(String[] args){
            SalaryCalculation.add(2000,500);
            SalaryCalculation.add(2000,300,"Rajesh");
            //System.out.println(SalaryCalculation.add("Rajesh",2000,500));
            //System.out.println("Salary is "+ SalaryCalculation.add("Rajesh" ,2000,500));
       }
    }
