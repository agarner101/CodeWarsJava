package digital_root;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests for {@link DigitalRoot}
 * Created by andrewgarner on 4/2/18.
 */
public class DigitalRootTest extends TestCase {

    //---- Solution 2 ----
    public void testSolve2A() throws Exception {
        Assert.assertEquals(7, DigitalRoot.solve2(16));
    }

    public void testSolve2B() throws Exception {
        Assert.assertEquals(6, DigitalRoot.solve2(942));
    }

    public void testSolve2C() throws Exception {
        Assert.assertEquals(6, DigitalRoot.solve2(132189));
    }

    public void testSolve2D() throws Exception {
        Assert.assertEquals(2, DigitalRoot.solve2(493193));
    }

    //---- Solution 1 ----
    public void testSolve1A() throws Exception {
        Assert.assertEquals(7, DigitalRoot.solve1(16));
    }

    public void testSolve1B() throws Exception {
        Assert.assertEquals(6, DigitalRoot.solve1(942));
    }

    public void testSolve1C() throws Exception {
        Assert.assertEquals(6, DigitalRoot.solve1(132189));
    }

    public void testSolve1D() throws Exception {
        Assert.assertEquals(2, DigitalRoot.solve1(493193));
    }

    //---- Solution 0 ----
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