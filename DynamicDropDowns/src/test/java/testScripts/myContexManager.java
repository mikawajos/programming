package testScripts;

public class myContexManager implements AutoCloseable {
    public myContexManager() {
        System.out.println("WLASNIE SIE TWORZE");
    }
    public void doSomething(){
        System.out.println("ROBIE COS WLASCIWIE");
    }

    @Override
    public void close(){
        System.out.println("KTOS MNEI TERAZ ZAMYKA");
    }
}

