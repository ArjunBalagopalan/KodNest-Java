
public class Main2 {

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.input();
        s1.display();

        Shape ref;
        ref = s1;
        ref.input();
        ref.display();
    }
}
