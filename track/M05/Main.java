
public class Main {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.osCheck();

        m = null;
        m.o.osCheck();
    }
}
