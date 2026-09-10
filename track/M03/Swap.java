
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = sc.nextInt();
        int right = sc.nextInt();

        // Validate the range
        if (left < 0 || right >= n || left > right) {
            System.out.println(-1);
            return;
        }

        // Two-pointer swap in place
        int i = left;
        int j = right;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        // Print the complete array
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + (k == n - 1 ? "" : " "));
        }
    }
}
