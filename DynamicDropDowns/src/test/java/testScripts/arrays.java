package testScripts;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        String bugs[] = {"cricket", "romet", "bundle"};
        String[] alias = bugs;

        System.out.println(bugs.equals(alias));

        Arrays.sort(bugs);
        for (String string : bugs) {
            System.out.println(string + " ");
        }

        System.out.println(bugs.toString());
        System.out.println(bugs.length + "\n---------------");

        int[] numbers = new int[] {1, 4, 6, 3, 2};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        int[] arrayNumbers = new int[] {11, 12, 10, 14, 15};
        Arrays.sort(arrayNumbers);
        System.out.println("NEW APPROACH\n---------------");
        for (int nr : arrayNumbers) {
            System.out.println("NUM: " + nr);
        }

    }

}
