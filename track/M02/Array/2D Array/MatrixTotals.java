
import java.util.Scanner;

public class MatrixTotals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            int total = 0;
            for (int j = 0; j <= arr[i].length - 1; j++) {
                total += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + total);
        }

        sc.close();
    }
}
