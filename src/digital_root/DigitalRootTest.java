package digital_root;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests for {@link DigitalRoot}
 * Created by andrewgarner on 4/2/18.
 */
public class DigitalRootTest extends TestCase {

    public void testSolve0A() throws Exception {
        Assert.assertEquals(7, DigitalRoot.solve0(16));
    }

    public void testSolve0B() throws Exception {
        Assert.assertEquals(6, DigitalRoot.solve0(942));
    }

    public void testSolve0C() throws Exception {
        Assert.assertEquals(6, DigitalRoot.solve0(132189));
    }

    public void testSolve0D() throws Exception {
        Assert.assertEquals(2, DigitalRoot.solve0(493193));
    }

}