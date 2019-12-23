package aggregation1;

public class Aggregation1 {

    public static void main(String[] args){
            Mark objMark1= new Mark(65,30,40,80,70);
            Class objClass1=new Class("4","E");
            Contacts objContact1=new Contacts("XXXXXXX","1234567890","hi@gmail.com");

            Mark objMark2= new Mark(65,50,40,80,70);
            Class objClass2=new Class("4","E");
            Contacts objContact2=new Contacts("yyyyyy","9876543210","bye@gmail.com");

            StudentDetails obj1 = new StudentDetails("Rajesh","23");
            obj1.mark(objMark1);
            obj1.Contacts(objContact1);
            obj1.Class(objClass1);
//            obj1.contacts.showContacts();
            obj1.getData();
            objContact1.showContacts();
            obj1.getDetails();

            StudentDetails obj2 = new StudentDetails("Kumar","24");
            obj2.mark(objMark2);
            obj2.Class(objClass2);
//            obj2.Contacts(objContact2);
            obj2.getData();
            obj2.getDetails();
    }
 }
