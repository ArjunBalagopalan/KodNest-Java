
import java.util.Scanner;

class Freq {

    void frequency(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + ": " + count);
    }
}

public class FreqReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Freq f1 = new Freq();
        f1.frequency(arr, target);

        sc.close();
    }
}
