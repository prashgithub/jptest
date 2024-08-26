package pr1;

public class Main {
    public static void main(String[] args) {
        WordFinder wordFinder = new WordFinder(CharCounter.CASE_SENSITIVE);

        String statement = "The Extraordinary compl~exity of the multifaceted algorithm Efficiently,, transformed intricate data into comprehensible, visually appealing insights";
        System.out.println(wordFinder.findWordWithMostOccurencesOfChar(statement, 'e'));//comprehensible
        System.out.println(wordFinder.findWordWithMostOccurencesOfChar(statement, 'E'));//Extraordinary
        System.out.println(wordFinder.findWordWithMostOccurencesOfChar(statement, 't'));//multifaceted
        System.out.println(wordFinder.findWordWithMostOccurencesOfChar(statement, 'T'));//The
        System.out.println(wordFinder.findWordWithMostOccurencesOfChar(statement, 'z'));//comprehensible (longest: absent letter)
        System.out.println(wordFinder.findWordWithMostOccurencesOfChar(statement, '~'));//comprehensible (longest: invalid word)
    }
}