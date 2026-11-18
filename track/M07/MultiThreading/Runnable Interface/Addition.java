
import java.util.Scanner;

class Addition implements Runnable {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition Activity Started");
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("Result is: " + result);
        System.out.println("Addition Activity Completed");
    }
}
