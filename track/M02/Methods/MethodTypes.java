
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

public class MethodTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        MethodDemo m = new MethodDemo();

        m.sayHello();
        m.greet(name);

        int luckyNumber = m.getLuckyNumber();
        System.out.println("Lucky Number: " + luckyNumber);

        int sum = m.add(first, second);
        System.out.println("Sum: " + sum);
    }
}
