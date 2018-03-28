package credit_card_mask;

/**
 * Credit Card Mask
 * <p>
 * Usually when you buy something, you're asked whether your credit card number,
 * phone number or answer to your most secret question is still correct. However,
 * since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
 * <p>
 * Your task is to write a function maskify, which changes all but the last four characters into '#'.
 * <p>
 * Examples:
 * Maskify.Maskify("4556364607935616"); // should return "############5616"
 * Maskify.Maskify("64607935616");      // should return "#######5616"
 * Maskify.Maskify("1");                // should return "1"
 * Maskify.Maskify("");                 // should return ""
 * // "What was the name of your first pet?"
 * Maskify.Maskify("Skippy");                                   // should return "##ippy"
 * Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
 * <p>
 * Problem by samranjbari
 * http://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
 * <p>
 * Created by andrewgarner on 3/27/18.
 */
public class CreditCardMask {

    /**
     * Attempt 1
     */
    public static String maskify1(String str) {
        //If size 4 or less, should display entire input
        if (str.length() <= 4) {
            return str;
        }
        //Pull out text that should be visible
        String visibleText = str.substring(str.length() - 4, str.length());
        StringBuilder builder = new StringBuilder(str.length());
        for (int i = 0; i < str.length() - 4; i++) {
            builder.append("#");
        }
        builder.append(visibleText);
        return builder.toString();
    }
}
