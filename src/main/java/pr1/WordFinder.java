package pr1;

import java.util.regex.Pattern;

import static java.util.Objects.requireNonNull;

public class WordFinder {
    private final CharCountStrategy counter;
    private static final Pattern VALID_WORD_PATTERN = Pattern.compile("^[a-zA-Z0-9]*([-_.][a-zA-Z0-9]*)?$");

    public WordFinder(CharCountStrategy counter) {
        this.counter = requireNonNull(counter, "Input strategy cannot be null.");
    }

    public String findWordWithMostOccurencesOfChar(String statement, char targetChar) {
        if (statement == null || statement.isBlank()) {
            return "";
        }

        String[] words = statement.split("[\\s.,;:!?()\"']+");  // Split by space and punctuation
        String result = "";
        int maxOccurrences = 0;

        for (String word : words) {
            if (isValidWord(word)) {
                int count = counter.countOccurrences(word, targetChar);
                if (count > maxOccurrences ||
                        (count == maxOccurrences && word.length() > result.length())) {
                    result = word;
                    maxOccurrences = count;
                }
            }
        }

        return result;
    }

    private boolean isValidWord(String word) {
        return VALID_WORD_PATTERN.matcher(word).matches();
    }
}
