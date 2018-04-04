package find_odd_int;

import junit.framework.TestCase;

/**
 * Tests for {@link FindOdd}
 * Created by andrewgarner on 4/3/18.
 */
public class FindOddTest extends TestCase {

    public void testSolve1() throws Exception {
        assertEquals(5, FindOdd.solve1(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, FindOdd.solve1(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, FindOdd.solve1(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, FindOdd.solve1(new int[]{10}));
        assertEquals(10, FindOdd.solve1(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, FindOdd.solve1(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

    public void testSolve0() throws Exception {
        assertEquals(5, FindOdd.solve0(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, FindOdd.solve0(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, FindOdd.solve0(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, FindOdd.solve0(new int[]{10}));
        assertEquals(10, FindOdd.solve0(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, FindOdd.solve0(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

}