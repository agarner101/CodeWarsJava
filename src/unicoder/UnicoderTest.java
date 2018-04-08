package unicoder;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests for {@link Unicoder}
 * Created by andrewgarner on 4/8/18.
 */
public class UnicoderTest extends TestCase {
    public void testDecode() throws Exception {
        Assert.assertEquals("hola", Unicoder.decode("\\u0068\\u006f\\u006c\\u0061"));
    }

    public void testEncode() throws Exception {
        Assert.assertEquals("\\u0068\\u006f\\u006c\\u0061", Unicoder.encode("hola"));
    }

}