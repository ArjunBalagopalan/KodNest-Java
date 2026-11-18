
public class Main {

    public static void main(String[] args) {
        Addition ad = new Addition();
        PrintChar pc = new PrintChar();
        PrintNum pn = new PrintNum();

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(pc);
        Thread t3 = new Thread(pn);

        t1.start();
        t2.start();
        t3.start();
    }
}
