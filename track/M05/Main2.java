
public class Main2 {

    public static void main(String[] args) {
        Mobile1 m;
        m = new Mobile1();

        m.o.osCheck();

        Charger c;
        c = new Charger();

        m.Charging(c);
        c.getCharge();

        c.getCharge();
    }
}
