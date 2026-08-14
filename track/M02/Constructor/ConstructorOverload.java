
public class ConstructorOverload {

    public static void main(String[] args) {
        Student221 s1 = new Student221();
        s1.display();
        Student221 s2 = new Student221("Manu");
        s2.display();
        Student221 s3 = new Student221("Raja", 18, 5.6);
        s3.display();
    }
}
