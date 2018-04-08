package is_divisible;

import junit.framework.TestCase;

/**
 * Tests for {@link IsDivisible}
 * Created by andrewgarner on 4/8/18.
 */
public class IsDivisibleTest extends TestCase {
    public void test1() throws Exception {
        assertEquals(true, IsDivisible.isDivisible(12, 4, 3));
    }

    public void test2() throws Exception {
        assertEquals(false, IsDivisible.isDivisible(3, 3, 4));
    }

}