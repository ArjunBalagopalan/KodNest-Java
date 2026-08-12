
import java.util.Scanner;

class Printer {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

public class TwoSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String word = sc.next();

        Printer p1 = new Printer();
        p1.show(number);
        p1.show(word);
    }
}
