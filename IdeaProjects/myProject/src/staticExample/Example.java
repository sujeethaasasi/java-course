package staticExample;

public class Example {

    static String firstName;

    public void setFirstName(String name) {

        firstName = name;
    }
    public void getFirstName() {
        System.out.println(firstName);
    }
}