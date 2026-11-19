
public class Main {

    public static void main(String[] args) {

        System.out.println("Main Thread Opened The File");
        Addition ad = new Addition();
        PrintChar pc = new PrintChar();
        PrintNum pn = new PrintNum();

        ad.start();
        pc.start();
        pn.start();

        try {
            ad.join();
            pc.join();
            pn.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread closed the file...");

    }
}
