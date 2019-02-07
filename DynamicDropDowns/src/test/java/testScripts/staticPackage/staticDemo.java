package testScripts.staticPackage;

public class staticDemo {

    public static void main(String[] args) {

        staticExampleClass s1 = new staticExampleClass("BMW");
        System.out.println("Make of car is: " + s1.getMake());
        System.out.println("Instance number: " + s1.getInstanceNum());

        staticExampleClass s2 = new staticExampleClass("BENZ");
        System.out.println("Make of car is: " + s2.getMake());
        System.out.println("Instance number: " + s2.getInstanceNum());
    }
}
