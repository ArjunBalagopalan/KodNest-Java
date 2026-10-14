
public class Main1 {

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        accessMethod(ch1);
        accessMethod(ch2);
    }

    static void accessMethod(Parent p) {
        if (p instanceof Child1) {
            Child1 c1 = (Child1) p;
            c1.disp1();
            c1.disp2();
        } else if (p instanceof Child2) {
            Child2 c2 = (Child2) p;
            c2.disp1();
            c2.disp2();
        }
    }
}
