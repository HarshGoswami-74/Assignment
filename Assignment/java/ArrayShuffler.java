import java.util.Random;

public class ArrayShuffler {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Original Array:");
        printArray(array);

        shuffleArray(array);

        System.out.println("Shuffled Array:");
        printArray(array);
    }

    // Fisher-Yates shuffle algorithm
    private static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randomIndex = random.nextInt(i + 1);

            // Swap the elements at randomIndex and i
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
