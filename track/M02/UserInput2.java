
import java.util.Scanner;

public class UserInput2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your height: ");
        float height = sc.nextFloat();
        System.out.println("Height is: " + height);

        sc.nextLine();
        System.out.println("enter your name:");
        String name = sc.nextLine();
        System.out.println("Name is: " + name);
    }
}
