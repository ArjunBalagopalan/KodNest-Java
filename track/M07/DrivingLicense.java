
import java.util.Scanner;

class DrivingLicense {

    int age;

    void takeAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age = sc.nextInt();
    }

    void verifyAge() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        } else if (age > 65) {
            throw new OverAgeException();
        } else {
            System.out.println("Driving License Issued");
        }

    }
}
