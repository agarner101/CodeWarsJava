package credit_card_mask;

import junit.framework.TestCase;

/**
 * Test for {@link CreditCardMask}
 * Created by andrewgarner on 3/27/18.
 */
public class CreditCardMaskTest extends TestCase {

    public void testMaskify1() throws Exception {
        assertEquals("############5616", CreditCardMask.maskify1("4556364607935616"));
        assertEquals("#######5616", CreditCardMask.maskify1("64607935616"));
        assertEquals("5616", CreditCardMask.maskify1("5616"));
        assertEquals("1", CreditCardMask.maskify1("1"));
        assertEquals("", CreditCardMask.maskify1(""));
    }

}