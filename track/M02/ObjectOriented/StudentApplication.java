
class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 12;
        s1.name = "Manoj";
        s1.height = 5.7;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.run();
        s1.sleep();
    }
}
