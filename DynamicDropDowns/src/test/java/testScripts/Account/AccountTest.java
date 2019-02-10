package testScripts.Account;

import java.util.Scanner;

import static org.testng.Assert.assertEquals;

public class AccountTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        assertEquals(myAccount.getName(), "Marcin", "Marcin was not found");
        System.out.println("New name is: " + myAccount.getName());
    }
}
