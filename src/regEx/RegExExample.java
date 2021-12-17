package regEx;

import java.util.regex.Pattern;



/**
 * A compiled representation of a regular expression.
 *
 * <p> A regular expression, specified as a string, must first be compiled into
 * an instance of this class.  The resulting pattern can then be used to create
 * a {@link java.util.regex.Matcher} object that can match arbitrary {@linkplain
 * java.lang.CharSequence character sequences} against the regular
 * expression.  All of the state involved in performing a match resides in the
 * matcher, so many matchers can share the same pattern.
 *
 * <p> A typical invocation sequence is thus
 *
 * <blockquote><pre>
 * Pattern p = Pattern.{@link #compile compile}("a*b");
 * Matcher m = p.{@link java.util.regex.Matcher matcher}("aaaaab");
 * boolean b = m.{@link java.util.regex.Matcher#matches matches}();</pre></blockquote>
 *
 * <p> A {@link java.util.regex.Matcher#matches matches} method is defined by this class as a
 * convenience for when a regular expression is used just once.  This method
 * compiles an expression and matches an input sequence against it in a single
 * invocation.  The statement
 *
 * <blockquote><pre>
 * boolean b = Pattern.matches("a*b", "aaaaab");</pre></blockquote>
 *
 * is equivalent to the three statements above, though for repeated matches it
 * is less efficient since it does not allow the compiled pattern to be reused.
 *
 * <p> Instances of this class are immutable and are safe for use by multiple
 * concurrent threads.  Instances of the {@link java.util.regex.Matcher} class are not safe for
 * such use.
 * */



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
