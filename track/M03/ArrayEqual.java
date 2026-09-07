
import java.util.Scanner;

public class ArrayEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // 1. Check if sizes are different
        if (n != m) {
            System.out.println(0);
            return; // Stop execution early
        }

        // 2. Compare elements at each index
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println(0);
                return; // Exit immediately on first mismatch
            }
        }

        // 3. If all checks pass, arrays are identical
        System.out.println(1);
    }
}
