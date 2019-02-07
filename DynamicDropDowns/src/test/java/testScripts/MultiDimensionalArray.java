package testScripts;

public class MultiDimensionalArray {


    public static void main(String[] args) {
        int[][] myNumbers = {{1, 3, 5}, {7, 4, 6}};
        try {
            System.out.println(myNumbers[1][2]);
        } catch (Exception e) {
            System.out.println("this is an exeption: \n" + e + "\n" + e.getMessage());
        }
    }
}
