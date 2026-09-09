
import java.util.Scanner;

public class TwoPointers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int writeIndex = 0;
        for (int readIndex = 0; readIndex < a.length; readIndex++) {
            if (a[readIndex] != 0) {
                a[writeIndex] = a[readIndex];
                writeIndex++;
            }
        }

        while (writeIndex < a.length) {
            a[writeIndex] = 0;
            writeIndex++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
