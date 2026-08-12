
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, int b, double c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class CalApplication {

    public static void main(String[] args) {
        Addition a1 = new Addition();
        System.out.println(a1.add(2.5, 2.5, 3.10));
        System.out.println(a1.add(12, 14, 1.56));
        System.out.println(a1.add(12, 20, 40));
        System.out.println(a1.add(10.5, 12));

    }

}
