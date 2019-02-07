package testScripts.staticPackage;

public class staticExampleClass {

    private static String make;
    private static int instanceNum = 0;

    public staticExampleClass(String make) {
        this.make = make;
        instanceNum++;
    }

    public String getMake() {
        return make;
    }

    public int getInstanceNum() {
        return instanceNum;
    }
}
