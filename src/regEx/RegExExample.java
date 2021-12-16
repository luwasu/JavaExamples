package regEx;

import java.util.regex.Pattern;

public class RegExExample {

    public static void main(String[] args) {

        // For more details on what this RegEx does visit: https://regexr.com/
        // Copy and paste in the RegEx below and it will give you a detailed explanation of how it works.

        String emailRegex = "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";
        String validEmail = "username@domain.com";
        String badEmail = "user-name&domain.com.";

        Pattern pattern = Pattern.compile(emailRegex);

        System.out.println("The valid email: " + validEmail + " is " + pattern.matcher(validEmail).matches());
        System.out.println("The bad email: " + badEmail + " is " + pattern.matcher(badEmail).matches());

    }
}
