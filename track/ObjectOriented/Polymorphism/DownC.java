
public class DownC {

    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.display1();
        p.display2();
        ((Child1) (p)).display3();

    }
}
