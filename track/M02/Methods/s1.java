
import java.util.Scanner;

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class s1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        // 1. Read input
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int javaScore = sc.nextInt();
        int sqlScore = sc.nextInt();

        // 2. Call methods & print report
        utility.showReportTitle();
        utility.displayStudent(id, name);

        double percentage = utility.calculatePercentage(javaScore, sqlScore);
        System.out.println("Percentage: " + percentage);

        double passingPercentage = utility.getPassingPercentage();

        // 3. Final Pass/Fail evaluation
        if (percentage >= passingPercentage) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }
    }
}
