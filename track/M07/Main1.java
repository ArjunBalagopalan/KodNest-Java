
import java.util.Scanner;

class Main1 {

    public static void main(String[] args) {
        System.out.println("Main Method Execution Started");
        divide();
        System.out.println("Main Method Execution Ended");
    }

    static void divide() {
        try {
            System.out.println("Division Started");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Exception Handled");
        }
        System.out.println("Division Completed");

    }
}
