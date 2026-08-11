
import java.util.Scanner;

class Student {

    int id;
    String name;
    int javaScore;
}

public class Learner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first learner's details
        Student learner1 = new Student();
        learner1.id = sc.nextInt();
        learner1.name = sc.next();
        learner1.javaScore = sc.nextInt();

        // Read second learner's details
        Student learner2 = new Student();
        learner2.id = sc.nextInt();
        learner2.name = sc.next();
        learner2.javaScore = sc.nextInt();

        // Read new score for the first learner
        int newJavaScore = sc.nextInt();

        // Print details before update
        System.out.println("Before Update");
        System.out.println(learner1.id + " - " + learner1.name + " - " + learner1.javaScore);
        System.out.println(learner2.id + " - " + learner2.name + " - " + learner2.javaScore);

        // Update first learner's Java score
        learner1.javaScore = newJavaScore;

        // Print details after update
        System.out.println("After Update");
        System.out.println(learner1.id + " - " + learner1.name + " - " + learner1.javaScore);
        System.out.println(learner2.id + " - " + learner2.name + " - " + learner2.javaScore);
    }
}
