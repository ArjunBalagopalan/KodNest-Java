
import java.util.Scanner;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentObj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First student
        Student s1 = new Student();
        s1.registrationId = sc.nextInt();
        s1.name = sc.next();
        s1.attendancePercentage = sc.nextDouble();

        // Second student
        Student s2 = new Student();
        s2.registrationId = sc.nextInt();
        s2.name = sc.next();
        s2.attendancePercentage = sc.nextDouble();

        // Target selection
        int targetId = sc.nextInt();
        double newAttendance = sc.nextDouble();

        Student selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (targetId == s1.registrationId) {
            selectedStudent = s1;
        } else if (targetId == s2.registrationId) {
            selectedStudent = s2;
        }

        // Print selected status and output results
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Print both student records
        System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
        System.out.println(s2.registrationId + " - " + s2.name + " - " + s2.attendancePercentage + "%");
    }
}
