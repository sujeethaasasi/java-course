package aggregation;

public class StudentDetails {

    String name;
    int id;
    StudentMark marks;
    StudentContact contacts;
    StudentClass classSec;
    int total;
    String result;

    public StudentDetails(String name, int id, StudentMark marks1, StudentContact contacts1, StudentClass classSec1)
    {
        this.name =name;
        this.id =id;
        marks=marks1;
        contacts=contacts1;
        classSec =classSec1;

        total=marks.tamil+marks.english+marks.maths+marks.science+marks.social;

        if(marks.tamil>=35 && marks.english>=35 && marks.maths>=35 && marks.science>=35 && marks.social >=35){
            result="PASS";
        }else result="FAIL";
    }

    public void getDetails(){

        System.out.println("Name        : "+ name);
        System.out.println("ID          : "+ id);
        System.out.println("-----------------------------------------");
        System.out.println("Address     : "+contacts.address);
        System.out.println("Mobile No   : "+contacts.mobileNo);
        System.out.println("Email ID    : "+contacts.emailId);
        System.out.println("-----------------------------------------");
        System.out.println("Tamil       : "+marks.tamil);
        System.out.println("English     : "+marks.english);
        System.out.println("Maths       : "+marks.maths);
        System.out.println("Science     : "+marks.science);
        System.out.println("Social      : "+marks.social);
        System.out.println("-----------------------------------------");
        System.out.println("Total       : "+this.total);
        System.out.println("-----------------------------------------");
        System.out.println("Result      : "+this.result);
        System.out.println("****************************************");
    }
}
