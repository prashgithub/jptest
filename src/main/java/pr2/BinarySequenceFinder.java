package pr2;

public enum BinarySequenceFinder {
    ZERO('0'),
    ONE('1');

    private final char matcher;
    BinarySequenceFinder(char c) {
        matcher = c;
    }

    public int indexOfLongestSeq(int input) {
        String binaryStr = Integer.toBinaryString(input);

        int maxLength = 0;
        int curLength = 0;
        int startPos = -1;
        int maxStartPos = -1;

        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == matcher) {
                if (curLength == 0) {
                    startPos = i + 1;
                }
                curLength++;
                if (curLength > maxLength) {
                    maxLength = curLength;
                    maxStartPos = startPos;
                }
            } else {
                curLength = 0;
            }
        }
        //System.out.println("input: "+input+", binary: " + binaryStr +" maxStartPos: "+ maxStartPos);
        return maxStartPos;
    }
}
