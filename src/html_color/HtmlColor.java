package html_color;

import java.util.Locale;
import java.util.Random;

/**
 * HTML dynamic color string generation
 * <p>
 * Generate a valid randomly generated rgb color string. Assume all of them have 6 digits always.
 * <p>
 * 6 kyu
 * Created by andrewgarner on 4/8/18.
 */
public class HtmlColor {

    static String generateColor(Random random) {
        String red = Integer.toHexString(random.nextInt(257)); // [0,256]
        String green = Integer.toHexString(random.nextInt(257));
        String blue = Integer.toHexString(random.nextInt(257));

        return String.format(Locale.US, "#%s%s%s", red, green, blue);
    }
}
