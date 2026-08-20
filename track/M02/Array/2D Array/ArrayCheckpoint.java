
import java.util.Scanner;

public class ArrayCheckpoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read array size and elements
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        int arrayTotal = 0;
        for (int index = 0; index < size; index++) {
            numbers[index] = scanner.nextInt();
            arrayTotal += numbers[index];
        }

        // 2. Read matrix dimensions and elements
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];

        int matrixTotal = 0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = scanner.nextInt();
                matrixTotal += matrix[row][column];
            }
        }

        // Output results
        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);

        scanner.close();
    }
}
