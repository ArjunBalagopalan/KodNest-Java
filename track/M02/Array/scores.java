
import java.util.Scanner;

public class scores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] scores = new int[size];

        // Read all scores into the array
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        // Print header first
        System.out.print("Reverse scores:");

        // Display the scores from last to first
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(" " + scores[i]);
        }
    }
}
