package aggregation1;

public class StudentDetails{

    String name,id;
    Mark mark;
    Contacts contacts;
    Class aClass;
    int total;
    String result;

    public StudentDetails(String name,String id) {
        this.name = name;
        this.id = id;
    }

    public void getData() {
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("-----------------------------------------");
    }

    public void mark(Mark mark) {
       this.mark=mark;
       setTotal();
       setResult();
    }

    public void setTotal(){
        total=mark.tamil+mark.english+mark.maths+mark.science+mark.social;
    }

    public void setResult(){
        if(mark.tamil>=35 && mark.english>=35 && mark.maths>=35 && mark.science>=35 && mark.social >=35){
            result="PASS";
        }else result="FAIL";
    }

    public void Contacts(Contacts contacts){

        this.contacts=contacts;
    }

    public void Class(Class aClass){

        this.aClass=aClass;
    }

    public void getDetails(){
//        System.out.println("Name        : "+ name);
//        System.out.println("ID          : "+ id);
//        System.out.println("-----------------------------------------");
//        System.out.println("Address     : "+contacts.address);
//        System.out.println("Mobile No   : "+contacts.mobile);
//        System.out.println("Email ID    : "+contacts.emailId);
//        System.out.println("-----------------------------------------");
        System.out.println("Tamil       : "+mark.tamil);
        System.out.println("English     : "+mark.english);
        System.out.println("Maths       : "+mark.maths);
        System.out.println("Science     : "+mark.science);
        System.out.println("Social      : "+mark.social);
        System.out.println("-----------------------------------------");
        System.out.println("Total       : "+this.total);
        System.out.println("-----------------------------------------");
        System.out.println("Result      : "+this.result);
        System.out.println("****************************************");
        }
}

class Mark {
    int tamil,english,maths,science,social;

    public Mark(int tamil,int english,int maths,int science,int social){
        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;
    }
}

class Contacts{

    String address,mobile,emailId;

    public Contacts(String address,String mobile,String emailId){
        this.address=address;
        this.mobile=mobile;
        this.emailId=emailId;
    }
    public void showContacts(){
        System.out.println("Address     : "+address);
        System.out.println("Mobile No   : "+mobile);
        System.out.println("Email ID    : "+emailId);
        System.out.println("-----------------------------------------");

    }
}

class Class{
    String std,section;

    public Class(String std,String section){
        this.section=section;
        this.std=std;
    }
}

