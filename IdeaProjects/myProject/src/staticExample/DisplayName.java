package staticExample;

public class DisplayName {
    public static void main(String[] args){
        String name="Hi";

        Example objExample = new Example();
        objExample.setFirstName(name);
        objExample.getFirstName();

        objExample.setFirstName("Anything");
        objExample.getFirstName();

        objExample.setFirstName(name);
        objExample.getFirstName();


    }
}
