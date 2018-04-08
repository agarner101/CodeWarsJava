package html_color;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Random;

/**
 * Tests for {@link HtmlColor}
 * Created by andrewgarner on 4/8/18.
 */
public class HtmlColorTest extends TestCase {
    public void testGenerateColorLength() throws Exception {
        String color = HtmlColor.generateColor(new Random(1));

        Assert.assertEquals("Color: " + color, 7, color.length());
    }

    public void testGenerateColor() throws Exception {
        String color = HtmlColor.generateColor(new Random(2));

        Assert.assertEquals("Color: " + color, "#1c715", color);
    }

    public void testGenerateColor5InARow() throws Exception {
        for (int i = 0; i < 5; i++) {
            Random random = new Random(2);
            String color = HtmlColor.generateColor(random);
            Assert.assertEquals(i + " Color: " + color, "#1c715", color);
        }

    }

}