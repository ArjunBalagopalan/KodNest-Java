
import java.util.Scanner;

public class Pg1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int total = 0;
        System.out.println("Array Elements Are: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i <= num.length - 1; i++) {
            total += num[i];
        }
        System.out.println();
        System.out.println("Total: " + total);
    }
}
