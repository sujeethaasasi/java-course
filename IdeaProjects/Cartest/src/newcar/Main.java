package newcar;

public class Main {

    public static void main(String[] args) {
        String carbodytype, carenginetype;

        carEngine carobj = new carEngine();
        carobj.setenginetype(2);
        carbodytype=carobj.getenginetype();

        System.out.println(carbodytype);
    }
}

