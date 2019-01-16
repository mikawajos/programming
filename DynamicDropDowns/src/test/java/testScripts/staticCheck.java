package testScripts;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class staticCheck {
    private static final ArrayList<String> values = new ArrayList<>();
    public static final int NUM_BUCKETS = 45;
    public static int count=0;

    public staticCheck() {
        count++;
    }

    public static void main(String[] args) {
        List<String> list = asList("one", "two");
        //NUM_BUCKETS = 5;

        staticCheck c1 = new staticCheck();
        staticCheck c2 = new staticCheck();
        staticCheck c3 = new staticCheck();

        System.out.println(count);
        values.add("changed");
    }
}
