package testScripts;

public class interfacesAbstract {
    public interface Foo {
        int bar();
    }

    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public int bar() {
                System.out.println("inside bar() method in interface");
                return 0;
            }
        };
        int x = foo.bar();
    }
}
