package testScripts;

import java.util.Random;

public class mockITbegin {
    public boolean managerResponse(String question) {
        return mockITbegin.isResponsePositive(question);
    }

    public static boolean isResponsePositive(String value) {
        if (value == null) {
            return false;
        }
        int length = value.length();
        int randomNumber = randomNumber();
        return length == randomNumber ? true : false;
    }

    private static int randomNumber() {
        return new Random().nextInt(7);
    }
}

    /*@Test
    public void givenAppManager_whenStaticMethodCalled_thenValidateExpectedResponse() {
        new MockUp<mockITbegin>() {
            @Mock
            public boolean isResponsePositive(String value) {
                return false;
            }
        };

        assertFalse(mockITbegin.managerResponse("Some string..."));
    }*/