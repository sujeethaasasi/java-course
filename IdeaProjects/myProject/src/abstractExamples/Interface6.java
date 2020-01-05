package abstractExamples;

interface Animal {
    void motion();
//    void eating();
}

interface Human1 {
    void eating();
}

class Dog implements Animal {
    public void motion() {

        System.out.println("Running");
    }
}

public class Interface6 implements Animal, Human1 {
    public void motion() {

        System.out.println("Running");
    }

    public void eating() {

        System.out.println("Eating");
    }

    public static void main(String[] args) {

        Interface6 obj = new Interface6();
        obj.motion();

    }
}

