package multiples_3_or_5;

import junit.framework.TestCase;

/**
 * Tests for {@link Multiples}
 * Created by andrewgarner on 4/8/18.
 */
public class MultiplesTest extends TestCase {
    public void testSolutionA() throws Exception {
        assertEquals(23, Multiples.solution(10));
    }

    public void testSolutionB() throws Exception {
        assertEquals(78, Multiples.solution(20));
    }

}