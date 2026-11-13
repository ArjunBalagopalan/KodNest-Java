
public class Main3 {

    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.takeAge();

        try {
            dl.verifyAge();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
