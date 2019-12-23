package staticNumber;

public class Number {

    static int number=0;

    public Number(){
        this.number++; // this.number = this.number + 1;
    }

    public void getNumber(){
        System.out.println("Number of instance : "+number);
    }
}
