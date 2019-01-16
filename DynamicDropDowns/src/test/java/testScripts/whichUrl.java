package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class whichUrl {

    public static void main(String[] args) throws MalformedURLException {
        Set set = new HashSet();
        set.add(new URL("http://wolnifarmerzy.com.pl"));
        set.add(new URL("http://zagubionawyspa.com.pl"));
        set.add(new URL("http://editor.javastart.pl"));
        set.add(new URL("http://google.pl"));

        System.out.println("Size: "+set.size());
    }
}
