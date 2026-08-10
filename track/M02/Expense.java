
import java.util.Scanner;

public class Expense {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read monthly income and expense values
        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        // Calculate total expense and remaining amount
        double totalExpense = rentExpense + foodExpense + travelExpense;
        double remainingAmount = monthlyIncome - totalExpense;

        // Determine budget status
        String status;
        if (remainingAmount >= 0) {
            status = "Within budget";
        } else {
            status = "Over budget";
        }

        // Output results
        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
