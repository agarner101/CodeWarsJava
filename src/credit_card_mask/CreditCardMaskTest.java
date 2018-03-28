package credit_card_mask;

import junit.framework.TestCase;

/**
 * Test for {@link CreditCardMask}
 * Created by andrewgarner on 3/27/18.
 */
public class CreditCardMaskTest extends TestCase {

    private static final String EXPECTED_1 = "############5616";
    private static final String EXPECTED_2 = "#######5616";
    private static final String EXPECTED_3 = "5616";
    private static final String EXPECTED_4 = "1";
    private static final String EXPECTED_5 = "";
    private static final String EXPECTED_6 = "################ters";

    private static final String INPUT_1 = "4556364607935616";
    private static final String INPUT_2 = "64607935616";
    private static final String INPUT_3 = "5616";
    private static final String INPUT_4 = "1";
    private static final String INPUT_5 = "";
    private static final String INPUT_6 = "Test With Characters";

    public void testMaskify1() throws Exception {
        assertEquals(EXPECTED_1, CreditCardMask.maskify1(INPUT_1));
        assertEquals(EXPECTED_2, CreditCardMask.maskify1(INPUT_2));
        assertEquals(EXPECTED_3, CreditCardMask.maskify1(INPUT_3));
        assertEquals(EXPECTED_4, CreditCardMask.maskify1(INPUT_4));
        assertEquals(EXPECTED_5, CreditCardMask.maskify1(INPUT_5));
        assertEquals(EXPECTED_6, CreditCardMask.maskify1(INPUT_6));
    }

    public void testMaskify2() throws Exception {
        assertEquals(EXPECTED_1, CreditCardMask.maskify2(INPUT_1));
        assertEquals(EXPECTED_2, CreditCardMask.maskify2(INPUT_2));
        assertEquals(EXPECTED_3, CreditCardMask.maskify2(INPUT_3));
        assertEquals(EXPECTED_4, CreditCardMask.maskify2(INPUT_4));
        assertEquals(EXPECTED_5, CreditCardMask.maskify2(INPUT_5));
        assertEquals(EXPECTED_6, CreditCardMask.maskify2(INPUT_6));
    }

}