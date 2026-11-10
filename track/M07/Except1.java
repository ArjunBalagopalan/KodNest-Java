
import java.util.Scanner;

public class Except1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Connection Established");
        try {
            System.out.print("Enter the number1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the number2 : ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("the result is : " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Connection Terminated");
    }
}
