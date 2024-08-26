package pr2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pr2.BinarySequenceFinder.ONE;
import static pr2.BinarySequenceFinder.ZERO;

public class BinarySequenceFinderTest {

    @Test
    public void testIndexOfLongestSequenceOf_baseCase() {
        assertEquals(1, ZERO.indexOfLongestSeq(0));
        assertEquals(-1, ZERO.indexOfLongestSeq(1));
        assertEquals(1, ONE.indexOfLongestSeq(1));
        assertEquals(-1, ONE.indexOfLongestSeq(0));
    }

    @Test
    public void testIndexOfLongestSequenceOf_case1() {
        assertEquals(4, ONE.indexOfLongestSeq(156));
    }

    @Test
    public void testIndexOfLongestSequenceOf_case2() {
        assertEquals(3, ONE.indexOfLongestSeq(88));
    }

    @Test
    public void testIndexOfLongestSequenceOf_edgeCase_singleOne() {
        assertEquals(1, ONE.indexOfLongestSeq(128));
    }

    @Test
    public void testIndexOfLongestSequenceOf_edgeCase_lastOne() {
        assertEquals(9, ONE.indexOfLongestSeq(515)); // Binary: 100000011
    }

    @Test
    public void testIndexOfLongestSequenceOf_edgeCase_allOnes() {
        assertEquals(1, ONE.indexOfLongestSeq(15)); // Binary: 1111
    }

    @Test
    public void testIndexOfLongestSequenceOf_case_alternatingBits() {
        assertEquals(1, ONE.indexOfLongestSeq(170)); // Binary: 10101010
    }

    @Test
    public void testIndexOfLongestSequenceOf_largeNumber() {
        assertEquals(1, ONE.indexOfLongestSeq(1023)); // Binary: 1111111111
    }

    @Test
    public void testIndexOfLongestSequenceOf_startOfSequence() {
        assertEquals(1, ONE.indexOfLongestSeq(7)); // Binary: 111
    }

    @Test
    public void testIndexOfLongestSequenceOf_middleOfSequence() {
        assertEquals(1, ONE.indexOfLongestSeq(30)); // Binary: 11110
    }

    @Test
    public void testIndexOfLongestSequenceOf_endOfSequence() {
        assertEquals(1, ONE.indexOfLongestSeq(62)); // Binary: 111110
    }
}