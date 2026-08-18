
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        boolean found = false;

        for (int index = 0; index < size; index++) {
            if (numbers[index] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        System.out.print("Reverse order: ");
        for (int index = size - 1; index >= 0; index--) {
            System.out.print(numbers[index]);
            if (index > 0) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
