package testScripts;

public class stringImmutability {
    private String s;
    public void setS(String newS) {
        s = newS; //Setter makes it muttable;
    }


}

final class Immutable {
    private String s = "name";

    public String getS() {
        return s;
    }
}

