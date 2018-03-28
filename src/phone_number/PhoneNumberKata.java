package phone_number;

/**
 * Create Phone Number.
 * <p>
 * Write a function that accepts an array of 10 integers (between 0 and 9),
 * that returns a string of those numbers in the form of a phone number.
 * <p>
 * Example:
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * <p>
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 *
 * http://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 * Created by andrewgarner on 3/27/18.
 */
public class PhoneNumberKata {

    /**
     * Attempt 3
     * Pros:
     * 1. Short code
     * 2. Works well if format changes or array size increases
     * Cons:
     * 1. Many allocated strings
     */
    public static String createPhoneNumber3(int[] numbers) {
        String phone = "(XXX) XXX-XXXX";
        for (int i : numbers) {
            phone = phone.replaceFirst("X", Integer.toString(i));
        }
        return phone;
    }

    /**
     * Attempt 2
     * Copy of Attempt 1 but with string builder
     */
    public static String createPhoneNumber2(int[] numbers) {
        StringBuilder builder = new StringBuilder(14);
        for (int i : numbers) {
            builder.append(Integer.toString(i));
        }
        String str = builder.toString();
        return String.format("(%s) %s-%s",
                str.substring(0, 3),
                str.substring(3, 6),
                str.substring(6, 10));
    }

    /**
     * Attempt 1
     * Optimize with String builder
     */
    public static String createPhoneNumber1(int[] numbers) {
        String str = "";
        for (int i : numbers) {
            //TODO: Use a StringBuilder
            str += i;
        }
        return String.format("(%s) %s-%s",
                str.substring(0, 3),
                str.substring(3, 6),
                str.substring(6, 10));
    }
}
