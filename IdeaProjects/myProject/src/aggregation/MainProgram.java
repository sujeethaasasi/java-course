package aggregation;

public class MainProgram {
    public static void main(String[] args){
        StudentMark objMark1= new StudentMark(65,30,40,80,70);
        StudentClass objClass1=new StudentClass(4,"E");
        StudentContact objContact1=new StudentContact("XXXXXXX","1234567890","hi@gmail.com");

        StudentMark objMark2= new StudentMark(65,50,40,80,70);
        StudentClass objClass2=new StudentClass(4,"E");
        StudentContact objContact2=new StudentContact("yyyyyy","9876543210","bye@gmail.com");

        StudentDetails obj1 = new StudentDetails("Rajesh",23,objMark1, objContact1, objClass1);
        obj1.getDetails();
//        studentDetails obj1 = new studentDetails("Rajesh",23);
        //obj1.mark(objMark1);
        //obj1.contact(objContact1);
//        obj1.class1(objClass1);
//        obj1.getDetails();

        //obj1.mark(objMark1);
        //        obj1.class1(objClass1);
        //        obj1.getDetails();

        StudentDetails obj2 = new StudentDetails("Kumar",24,objMark2, objContact2, objClass2);
        obj2.getDetails();
    }
}
