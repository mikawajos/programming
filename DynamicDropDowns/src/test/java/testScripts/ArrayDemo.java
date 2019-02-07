package testScripts;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] anArray = new int[10];
        System.out.println("size of an 1st Array: " + anArray.length);
        for (int err : anArray) {
            System.out.println("element of an Array: " + err);

        }
        anArray = new int[]{1, 3, 7, 5, 2, 1, 0};
//        Arrays.sort(anArray);
        System.out.println("size of an 2nd Array: " + anArray.length);
        for (int err : anArray) {
            System.out.println("element of an Array: " + err);

        }
        anArray = new int[9];
        System.out.println("size of an 3rd Array: " + anArray.length);
        for (int err : anArray) {
            System.out.println("element of an Array: " + err);

        }
    }
}
