package pr1;

public enum CharCounter implements CharCountStrategy {
    CASE_INSENSITIVE {
        @Override
        protected boolean isSameChar(char c, char targetChar) {
            return super.isSameChar(Character.toLowerCase(c), Character.toLowerCase(targetChar));
        }
    },
    CASE_SENSITIVE;

    @Override
    public int countOccurrences(String word, char targetChar) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (isSameChar(c, targetChar)) {
                count++;
            }
        }
        return count;
    }

    protected boolean isSameChar(char c, char targetChar) {
        return c == targetChar;
    }
}
