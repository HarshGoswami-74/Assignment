import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean checkIfPangram(String s) {
        // Assuming the input contains only letters (no digits or punctuation)
        // Convert the input to lowercase for case-insensitive comparison
        s = s.toLowerCase();

        // Create an array to track the occurrence of each letter
        boolean[] alphabetOccurrence = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the current character is a lowercase letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a';
                alphabetOccurrence[index] = true;
            }
        }

        // Check if all letters have occurred at least once
        for (boolean letterOccurrence : alphabetOccurrence) {
            if (!letterOccurrence) {
                return false;
            }
        }

        return true;
    }
}
