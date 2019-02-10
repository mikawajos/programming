package testScripts;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReverseString {

@Test
    public static void cosTam() {
        String inputString = "this is a test string";
        String outputString = reverseString(inputString);

        System.out.println("input String: " + inputString);
        System.out.println("output String: " + outputString);
    }

    private static String reverseString(String inputString) {
        String reverse = "";
            String[] originalArray = inputString.split("\\s+");
        System.out.println("array length: " + originalArray.length + "\n---------------");
        for (int i = 0; i <= originalArray.length-1; i++) {
            System.out.println("original Array, index: " + i + ":: " + originalArray[i]);
            assertEquals(originalArray.length, 4, "Different length of Array: ");
        }

            for (String item : originalArray) {
                reverse = item + " " + reverse;
            }
            return reverse.trim();
        }
}
