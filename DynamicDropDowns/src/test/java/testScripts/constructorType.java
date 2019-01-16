package testScripts;


public class constructorType {
    private static String argInside;

    public constructorType(String sth){
//        System.out.println("aa");
        this();
        System.out.println("inside public constructor:  " + sth);
        this.argInside = sth;

    }

    private constructorType(){
        System.out.println("inside private constr");
    }

    public static void main(String[] args) {
        constructorType newObj = new constructorType("tatata");
        System.out.println();
    }
}
