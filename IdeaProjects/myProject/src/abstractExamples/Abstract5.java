package abstractExamples;

abstract class Human{
    String name;

    abstract void motion();
    abstract String eating();
    public void name() {
        this.name = name;
    }
}

class Others extends Human {
    void motion()
    {
        System.out.println("Walking");
    }

    String eating() {

        return "Rice";
    }
}

public class Abstract5 extends Human {

    void motion() {

        System.out.println("Running");
    }

    String eating() {

        return "Chapathi";
    }

    public static void main(String[] args) {
        Human obj = new Abstract5();
        obj.motion();
        obj.eating();

        Others obj2 = new Others();
        obj2.motion();
        obj2.eating();
    }
}

