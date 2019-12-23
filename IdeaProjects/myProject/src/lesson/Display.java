package lesson;

public class Display {

    public static void main(String[] args) {
        Example objShow = new Example();

        objShow.setSno(50);
        objShow.displaySno();

        objShow.setName("King Kong");
        objShow.displayName();

        Example objShow1 = new Example();
        objShow1.displaySno();
        objShow1.displayName();

        Example objShow2 = new Example(22, "Mani");
        objShow2.displaySno();
        objShow2.displayName();

        Example objShow3 = new Example(44);
        objShow3.displaySno();
        objShow3.displayName();

        new Example().displayName();

//        new Table(5).times(12);

    }

}
