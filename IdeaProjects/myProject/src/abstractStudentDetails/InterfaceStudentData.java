package abstractStudentDetails;

import javax.swing.*;
import java.awt.datatransfer.StringSelection;

interface Details {

    void studentName(String name,int id);
    void studentClass(int std,String section);
    void studentMarks(int tamil,int english,int maths,int science,int social);
}
interface Details2 {
    void studentContact(String mobile,String emailId);
}

class SchoolDetails implements Details{
    String name,section;
    int std,id,tamil,english,maths,science,social;

    public void studentName(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Student Name : "+this.name);
        System.out.println("Student ID : "+this.id);
    }
    public void studentClass(int std, String section){
        this.std=std;
        this.section=section;
        System.out.println("Student Class : "+this.std);
        System.out.println("Student section : "+this.section);
    }

    public void studentMarks(int tamil,int english,int maths,int science,int social){
        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;

        System.out.println("Tamil : "+this.tamil);
        System.out.println("English : "+this.english);
        System.out.println("Maths : "+this.maths);
        System.out.println("Science : "+this.science);
        System.out.println("Social : "+this.social);

    }
}

class CollageData implements Details,Details2{
    String name,section;
    int std,id,tamil,english,maths,science,social;
    String mobile,emailID;

    public void studentName(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Student Name : "+this.name);
        System.out.println("Student ID : "+this.id);
    }
    public void studentClass(int std, String section){
        this.std=std;
        this.section=section;
        System.out.println("Student Class : "+this.std);
        System.out.println("Student section : "+this.section);
    }

    public void studentMarks(int tamil,int english,int maths,int science,int social){
        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;

        System.out.println("Tamil : "+this.tamil);
        System.out.println("English : "+this.english);
        System.out.println("Maths : "+this.maths);
        System.out.println("Science : "+this.science);
        System.out.println("Social : "+this.social);

    }

    public void studentContact(String mobile,String emailID){
        this.mobile=mobile;
        this.emailID=emailID;

        System.out.println("Student Mobile : "+this.mobile);
        System.out.println("Student Email ID : "+this.emailID);
    }
}
public class InterfaceStudentData {
/*
    String name,section;
    int std,id,tamil,english,maths,science,social;
    String mobile,emailID;

    public void studentName(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Student Name : "+this.name);
        System.out.println("Student ID : "+this.id);
    }
    public void studentClass(int std, String section){
        this.std=std;
        this.section=section;
        System.out.println("Student Class : "+this.std);
        System.out.println("Student section : "+this.section);
    }

    public void studentMarks(int tamil,int english,int maths,int science,int social){
        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;

        System.out.println("Tamil : "+this.tamil);
        System.out.println("English : "+this.english);
        System.out.println("Maths : "+this.maths);
        System.out.println("Science : "+this.science);
        System.out.println("Social : "+this.social);

    }

    public void studentContact(String mobile,String emailID){
        this.mobile=mobile;
        this.emailID=emailID;

        System.out.println("Student Mobile : "+this.mobile);
        System.out.println("Student Email ID : "+this.emailID);
    }*/
    public static void main(String args[]){

        SchoolDetails objSchool= new SchoolDetails();
        objSchool.studentName("Rajesh",23);
        objSchool.studentClass(10,"E");
        objSchool.studentMarks(40,50,60,70,80);

        CollageData objCollage = new CollageData();
        objCollage.studentName("Kumar",24);
        objCollage.studentClass(1,"E");
        objCollage.studentContact("987654321","xxxxxxxx@gmail.com");
        objCollage.studentMarks(70,60,50,40,30);
    }


}
