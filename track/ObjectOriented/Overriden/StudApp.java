
public class StudApp {

    public static void main(String[] args) {
        Stud s1 = new Stud(11, "Arjun");
        Stud s2 = new Stud(12, "Raju");
        Stud s3 = new Stud(11, "Arjun");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));;
    }
}
