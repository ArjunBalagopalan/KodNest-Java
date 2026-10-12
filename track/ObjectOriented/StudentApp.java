
public class StudentApp {

    public static void main(String[] args) {
        Student s1 = new Student(11, "Arjun");
        Student s2 = new Student(12, "Raju");
        Student s3 = new Student(11, "Arjun");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));;
    }
}
