
import java.util.Scanner;

public class CinemaSeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int seats[][] = new int[rows][cols];

        for (int i = 0; i <= seats.length - 1; i++) {
            for (int j = 0; j <= seats[i].length - 1; j++) {
                seats[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i <= seats.length - 1; i++) {
            for (int j = 0; j <= seats[i].length - 1; j++) {
                if (seats[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);
    }
}
