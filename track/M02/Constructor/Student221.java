
class Student221 {

    String name;
    int age;
    double height;

    public Student221() {
        name = "Anu";
        age = 19;
        height = 4.5;
    }

    Student221(String name) {
        this.name = name;
    }

    Student221(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
