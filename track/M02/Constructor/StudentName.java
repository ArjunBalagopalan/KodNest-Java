
import java.util.Scanner;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class StudentName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name
        String name = scanner.nextLine();

        // Create one Student object
        Student s1 = new Student(name);

        // Call display()
        s1.display();
    }
}
