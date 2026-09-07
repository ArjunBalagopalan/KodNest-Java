
import java.util.Scanner;

public class Range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the lower and upper bounds
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        // Count how many elements fall within [lower, upper]
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }

        // Print the result
        System.out.println(count);
    }
}
