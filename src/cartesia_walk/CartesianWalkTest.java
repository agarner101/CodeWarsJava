package cartesia_walk;

import junit.framework.TestCase;

/**
 * Tests for {@link CartesianWalk}
 * Created by andrewgarner on 4/2/18.
 */
public class CartesianWalkTest extends TestCase {

    //---- Solution 0 ----
    public void testSolve0A() throws Exception {
        assertEquals(true, CartesianWalk.solve0(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }

    public void testSolve0B() throws Exception {
        //False because length > 10
        assertEquals(false, CartesianWalk.solve0(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
    }

    public void testSolve0C() throws Exception {
        //False because of length < 10 AND not returning to origin
        assertEquals(false, CartesianWalk.solve0(new char[] {'w'}));
    }

    public void testSolve0D() throws Exception {
        //False because does not return to origin.
        assertEquals(false, CartesianWalk.solve0(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }

    public void testSolve0E() throws Exception {
        assertEquals(true, CartesianWalk.solve0(new char[] {'n', 'n', 's', 's', 'e', 'e', 'e', 'w', 'w', 'w'}));
    }

}