package pr1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFinderTest {
    private WordFinder finder;

    @BeforeEach
    public void beforeEach() {
        finder = new WordFinder(CharCounter.CASE_SENSITIVE);
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_case2() {
        String statement = "This is the right time and I want to educate everyone in this whole crazy world";
        assertEquals("I", finder.findWordWithMostOccurencesOfChar(statement, 'I'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_case3() {
        String statement = "This is the right time and I want to educate everyone in this whole crazy world";
        assertEquals("everyone", finder.findWordWithMostOccurencesOfChar(statement, 'e'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_edgeCase_noOccurrence() {
        String statement = "This is the right time";
        assertEquals("right", finder.findWordWithMostOccurencesOfChar(statement, 'x'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_edgeCase_emptyStatement() {
        String statement = "";
        assertEquals("", finder.findWordWithMostOccurencesOfChar(statement, 'a'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_nullStatement() {
        String statement = null;
        assertEquals("", finder.findWordWithMostOccurencesOfChar(statement, 'a'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_edgeCase_multipleWordsWithSameCount() {
        String statement = "book cook look took";
        assertEquals("book", finder.findWordWithMostOccurencesOfChar(statement, 'o'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_caseSensitive() {
        String statement = "apple Apple";
        assertEquals("apple", finder.findWordWithMostOccurencesOfChar(statement, 'a'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_caseSensitive2() {
        String statement = "This is the right time and I want to tell you everything but I am lazy";
        assertEquals("lazy", finder.findWordWithMostOccurencesOfChar(statement, 'z'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_caseInsensitive() {
        finder = new WordFinder(CharCounter.CASE_INSENSITIVE);
        String statement = "This is the right time and I want to tell you everything but I am lazy";
        assertEquals("everything", finder.findWordWithMostOccurencesOfChar(statement, 'T'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_caseInsensitiveHandling() {
        String statement = "Apple aPple appLe applE";
        assertEquals("Apple", finder.findWordWithMostOccurencesOfChar(statement, 'p'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_nonAlphanumericCharacter() {
        String statement = "Hello, world! How's it going?";
        assertEquals("Hello", finder.findWordWithMostOccurencesOfChar(statement, 'o'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_punctuationHandling() {
        String statement = "hello! world!!";
        assertEquals("hello", finder.findWordWithMostOccurencesOfChar(statement, 'o'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_invalidWordIgnored() {
        String statement = "hello!! he@llo he--llo";
        assertEquals("hello", finder.findWordWithMostOccurencesOfChar(statement, 'l'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_hyphenatedWord() {
        String statement = "this is a well-known fact.";
        assertEquals("well-known", finder.findWordWithMostOccurencesOfChar(statement, 'l'));
    }

    @Test
    public void testFindWordWithMostOccurencesOfChar_underscoreWord() {
        String statement = "this_is an example with underscore_word.";
        assertEquals("underscore_word", finder.findWordWithMostOccurencesOfChar(statement, 'r'));
    }
}
