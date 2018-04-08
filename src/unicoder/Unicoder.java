package unicoder;

/**
 * Java format Unicode encoder/decoder
 * We need a reusable program to encode/decode text to unicode value as represented in Java and vice-versa.
 * Created by andrewgarner on 4/8/18.
 */
class Unicoder {

    static String decode(final String input) {
        StringBuilder sb = new StringBuilder();
        String[] split = input.split("\\\\u");
        for (String element : split) {
            if (element.isEmpty()) continue;
            int value = Integer.parseInt(element, 16);
            sb.append((char) value);
        }
        return sb.toString();
    }

    static String encode(final String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int codePoint = (int) input.charAt(i);
            String s = String.format("\\u%04x", codePoint);
            sb.append(s);
        }
        return sb.toString();
    }
}
