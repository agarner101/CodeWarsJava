package format_words_into_sentences;

import java.util.ArrayList;
import java.util.List;

/**
 * Format words into a sentence
 * <p>
 * Complete the method so that it formats the words into a single comma separated value.
 * The last word should be separated by the word 'and' instead of a comma. The method takes in an array of strings
 * and returns a single formatted string. Empty string values should be ignored. Empty arrays or null/nil values
 * being passed into the method should result in an empty string being returned.
 * <p>
 * 6 Kyu
 * <p>
 * https://www.codewars.com/kata/format-words-into-a-sentence
 */
class WordFormat {

    static String formatWords(String[] input) {
        if (input == null || input.length == 0) return "";

        List<String> list = new ArrayList<>();
        for (String value : input) {
            if (!value.isEmpty()) {
                list.add(value);
            }
        }

        if (list.size() == 0) return "";
        if (list.size() == 1) return list.get(0);

        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i).isEmpty()) continue;
            sb.append(", ");
            sb.append(list.get(i));
        }
        sb.append(" and ");
        sb.append(list.get(list.size() - 1));

        return sb.toString();
    }
}
