package unique_number;

import junit.framework.TestCase;

/**
 * Tests for {@link UniqueNumber}
 * Created by andrewgarner on 4/8/18.
 */
public class UniqueNumberTest extends TestCase {

    public void testFindUniq() throws Exception {
        final double precision = 0.0000000000001;
        assertEquals(1.0, UniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, UniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }

}
