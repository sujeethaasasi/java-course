package lesson;

public class Example {

    public int sno;
    public String name;

    public Example() {
        this.sno = 101;
        this.name = "Real Man";
    }

    public Example(int num, String name) {
        this.sno = num;
        this.name = name;
    }

    public Example(int num) {
        this.sno = num;
    }

    public void show() {

        System.out.println("Showing information");
    }

    public void setSno(int number){
        this.sno = number;
    }

    public void displaySno() {
        System.out.println("Number is " + sno);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name is " + name);
    }


}
