import java.security.SecureRandom;

public class randomString {


    private static final String ALPHANUMERIC_SPECIAL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?/{}[]";

    public static void main(String[] args) {
        String randomString = generateRandomString(8);
        System.out.println("Random String: " + randomString);
    }

    private static String generateRandomString(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(ALPHANUMERIC_SPECIAL_CHARS.length());
            char randomChar = ALPHANUMERIC_SPECIAL_CHARS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}

/*In this code, we define a constant ALPHANUMERIC_SPECIAL_CHARS, which contains all the alphanumeric and special characters you want to include in the random string. The generateRandomString method uses the SecureRandom class from the java.security package to ensure a cryptographically strong source of random numbers. The method loops through the desired length and selects random characters from the ALPHANUMERIC_SPECIAL_CHARS string to build the final random string.

The generated random string of 8 characters will be displayed in the console when you run the Java program. You can store it in a variable or use it as needed for your specific use case.

*/





