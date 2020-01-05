package abstractStudentDetails;

abstract class MainDetails{

    public String name,section,mobileNo,emailID;
    public int id,std;

    public int tamil,english,maths,science,social;

    abstract void studentDetails(String name,int id);
    abstract void classes(int std,String section);

    public void marks(int tamil,int english,int maths,int science,int social){

        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;
    }

    void contacts(String mobileNo,String emailID){
        this.mobileNo=mobileNo;
        this.emailID=emailID;
    }
}

class SchoolStudent extends MainDetails {

    void studentDetails(String name,int id){
        this.name=name;
        this.id=id;

        System.out.println("Student Name : " + this.name);
        System.out.println("Student ID : " + this.id);
    }
    void classes(int std,String section){
        this.std=std;
        this.section=section;

        System.out.println("Class : " + this.std);
        System.out.println("Section : " + this.section);
    }

    public void marks(int tamil,int english,int maths,int science,int social){

        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;

        System.out.println("Tamil : " + this.tamil);
        System.out.println("English : " + this.english);
        System.out.println("Maths : " + this.maths);
        System.out.println("Science : " + this.science);
        System.out.println("Social : " + this.social);

    }
}
class CollageStudents extends MainDetails {

    void studentDetails(String name, int id) {
        this.name = name;
        this.id = id;

        System.out.println("Student Name : " + this.name);
        System.out.println("Student ID : " + this.id);
    }

    void classes(int std, String section) {
        this.std = std;
        this.section = section;

        System.out.println("Class : " + this.std);
        System.out.println("Section : " + this.section);
    }

    void contacts(String mobileNo,String emailId){
        this.mobileNo=mobileNo;
        this.emailID=emailId;

        System.out.println("Student Mobile number : "+this.mobileNo);
        System.out.println("Student EmailID  : "+this.emailID);

        }
}
/*
public class StudentData extends MainDetails{

    void studentDetails(String name,int id) {
        this.name=name;
        this.id=id;

        System.out.println("Student Name : "+this.name);
        System.out.println("Student ID : "+this.id);
    }

    void classes(int std,String section) {
        this.std=std;
        this.section=section;

        System.out.println("Class : "+this.std);
        System.out.println("Section :"+this.section);
    }
*/

public class StudentData{

    public static void main (String args[]){

        MainDetails objMain = new SchoolStudent();
        objMain.studentDetails("Rajesh",23);
        objMain.classes(4,"E");
        objMain.marks(30,40,50,60,70);

        MainDetails objSchool = new CollageStudents();
        objSchool.studentDetails("Kumar",24);
        objSchool.classes(4,"f");
        objSchool.contacts("987654321","xxxxxxxxx@gmail.com");

    }
}

