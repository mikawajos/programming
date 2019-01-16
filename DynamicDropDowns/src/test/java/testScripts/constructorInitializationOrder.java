package testScripts;

public class constructorInitializationOrder {
    private String name = "Marcin";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }
    {COUNT++;
        System.out.println(COUNT);}

        public constructorInitializationOrder(){
            System.out.println("inside constructor");
        }

    public static void main(String[] args) {
        System.out.println("read to construct");
        new constructorInitializationOrder();
    }
}

// 1. if there is a superclass initialize it first
// 2. static variable declarations and static initializers in the order they appear in the file
// 3. instance variable declaration and instance initializers in the order they appear in the file
//4. the constructor

