package format_words_into_sentences;

import junit.framework.TestCase;

/**
 * Tests for {@link WordFormat}
 * Created by andrewgarner on 4/8/18.
 */
public class WordFormatTest extends TestCase {
    public void testFormatWords() throws Exception {
        assertEquals("one, two, three and four", WordFormat.formatWords(new String[] {"one", "two", "three", "four"}));
        assertEquals("one", WordFormat.formatWords(new String[] {"one"}));
        assertEquals("one and three", WordFormat.formatWords(new String[] {"one", "", "three"}));
        assertEquals("three", WordFormat.formatWords(new String[] {"", "", "three"}));
        assertEquals("one and two", WordFormat.formatWords(new String[] {"one", "two", ""}));
        assertEquals("", WordFormat.formatWords(new String[] {}));
        assertEquals("", WordFormat.formatWords(null));
        assertEquals("", WordFormat.formatWords(new String[] {""}));
    }

}