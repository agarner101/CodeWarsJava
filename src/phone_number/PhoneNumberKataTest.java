package phone_number;

import junit.framework.TestCase;

/**
 * Test for {@link PhoneNumberKata}
 * Created by andrewgarner on 3/27/18.
 */
public class PhoneNumberKataTest extends TestCase {

    private static final int[] NUMBERS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    public void test(String input) throws Exception {
        assertEquals("(123) 456-7890", input);
    }

    public void testCreatePhoneNumber1() throws Exception {
        test(PhoneNumberKata.createPhoneNumber1(NUMBERS));
    }

    public void testCreatePhoneNumber2() throws Exception {
        test(PhoneNumberKata.createPhoneNumber2(NUMBERS));
    }

    public void testCreatePhoneNumber3() throws Exception {
        test(PhoneNumberKata.createPhoneNumber3(NUMBERS));
    }

}
