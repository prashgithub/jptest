package pr2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int number = scanner.nextInt();

        int position = BinarySequenceFinder.ONE.indexOfLongestSeq(number);

        if (position != -1) {
            System.out.println("The longest sequence of 1s in the binary representation of " + number + " starts at position: " + position);
        } else {
            System.out.println("There are no 1s in the binary representation of " + number);
        }
        scanner.close();
    }
}

