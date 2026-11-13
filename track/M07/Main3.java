
public class Main3 {

    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.takeAge();

        try {
            dl.verifyAge();
        } catch (UnderAgeException e1) {
            e1.printStackTrace();
        } catch (OverAgeException e2) {
            e2.printStackTrace();
        }
    }
}
