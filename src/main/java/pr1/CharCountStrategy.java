package pr1;

@FunctionalInterface
interface CharCountStrategy {
    int countOccurrences(String word, char targetChar);
}
