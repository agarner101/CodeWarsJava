package simple_encryption_1;

/**
 * Simple Encryption 1
 * For building the encrypted string:
 * Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
 * Do this n times!
 * <p>
 * https://www.codewars.com/kata/simple-encryption-number-1-alternating-split/train/java
 * Created by andrewgarner on 4/7/18.
 */
class SimpleEncryption1 {

    /**
     * Solution 0
     */
    static String encrypt(final String text, final int n) {
        if (n < 1 || text == null || text.isEmpty()) return text;

        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                sbEven.append(text.charAt(i));
            } else {
                sbOdd.append(text.charAt(i));
            }
        }
        String result = sbOdd.append(sbEven.toString()).toString();
        return encrypt(result, n - 1);
    }

    /**
     * Solution 0
     */
    static String decrypt(final String encryptedText, final int n) {
        if (n < 1 || encryptedText == null || encryptedText.isEmpty()) return encryptedText;

        StringBuilder sb = new StringBuilder();
        int middle = encryptedText.length() / 2;
        for (int i = 0; i < middle; i++) {
            sb.append(encryptedText.charAt(i + middle));
            sb.append(encryptedText.charAt(i));
        }
        if (encryptedText.length() % 2 != 0) {
            sb.append(encryptedText.charAt(encryptedText.length() - 1));
        }
        String result = sb.toString();
        return decrypt(result, n - 1);
    }

}
