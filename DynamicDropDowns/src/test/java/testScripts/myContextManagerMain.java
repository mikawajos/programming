package testScripts;

public class myContextManagerMain {
        public static void main(String[] args) {
            try(myContexManager manager = new myContexManager()){
                manager.doSomething();
            }
        }
    }
