package testScripts;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("name5");
        StringBuilder sbNew = new StringBuilder("newStringBuilder");
        String sub = sbNew.substring(sb.indexOf("a"), sb.indexOf("e"));
        int len = sb.length();
        char ch=0;
        String s = sb.toString();
        System.out.println("toString wynosi:: " + s);

        try {
            ch = sb.charAt(3);
        } catch (Exception e) {
            System.out.println("outOfBoundException!!!! for length: " + sb.length());
            e.printStackTrace();
        }
        System.out.println(sub + " " + len + " " + ch);
        /*String systemProperty = System.getProperty("line.separator");
        String lineSeparator = System.lineSeparator();
        System.out.println("lineSeparator:: " + lineSeparator);
        System.out.println("System getProperty:: " + System.getProperty("lineSeparator"))*/;
    }
}
