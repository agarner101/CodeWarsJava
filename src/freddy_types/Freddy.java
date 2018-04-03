package freddy_types;

/**
 * Freddy
 *
 * Freddy has a really fat left pinky finger, and every time Freddy tries to type an A,
 * he accidentally hits the CapsLock key!

 Given a string that Freddy wants to type, emulate the keyboard misses where each A supposedly pressed is replaced
 with CapsLock, and return the string that Freddy actually types. It doesn't matter if the A in the string is
 capitalized or not. When CapsLock is enabled, capitalization is reversed, but punctuation is not affected.
 *
 * https://www.codewars.com/kata/fat-fingers/train/java
 * Created by andrewgarner on 4/3/18.
 */
class Freddy {


    /**
     * Attempt 1
     */
    static String solve1(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder sb = new StringBuilder(str.length());
        boolean caps = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                caps = !caps;
                continue;
            }
            if (caps) {
                if (c >= 'A' && c <= 'Z') {
                    c += 32;
                } else if (c >= 'a' && c <= 'z') {
                    c -= 32;
                }
            }


            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Attempt 0
     */
    static String solve0(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder sb = new StringBuilder(str.length());
        boolean caps = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                caps = !caps;
                continue;
            }
            if (caps) {
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                } else {
                    c = Character.toUpperCase(c);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
