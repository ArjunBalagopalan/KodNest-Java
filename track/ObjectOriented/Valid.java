
import java.util.Scanner;

class Employee {

    private int age;

    public boolean setAge(int age) {
        // Validate and store age
        if (age >= 18 && age <= 60) {
            this.age = age;
            return true;
        }
        return false;
    }

    public int getAge() {
        // Return the stored age
        return age;
    }
}

public class Valid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        Employee employee = new Employee();

        if (employee.setAge(age)) {
            System.out.println(employee.getAge());
        } else {
            System.out.println("Invalid age");
        }
    }
}
