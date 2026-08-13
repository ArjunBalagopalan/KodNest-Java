
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the student's name
        String name = scanner.nextLine();

        // 2. Create one Student object
        Student s1 = new Student();

        // 3. Call setName()
        s1.setName(name);

        // 4. Call displayName()
        s1.displayName();
    }
}
