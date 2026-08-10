
import java.util.Scanner;

public class Learner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read full name (can contain spaces)
        String name = scanner.nextLine();

        // Read number of practice days
        int practiceDays = scanner.nextInt();

        int totalProblemSolved = 0;

        // Loop to read daily solved problems and calculate total
        for (int i = 1; i <= practiceDays; i++) {
            int problemSolved = scanner.nextInt();
            totalProblemSolved += problemSolved;
        }

        // Calculate decimal daily average
        double dailyAverage = (double) totalProblemSolved / practiceDays;

        // Determine readiness status
        String status = dailyAverage >= 5.0 ? "Consistent" : "Needs consistency";

        // Print outputs in required format
        System.out.println("Learner: " + name);
        System.out.println("Total solved: " + totalProblemSolved);
        System.out.println("Daily average: " + dailyAverage);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
