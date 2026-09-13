
public class StringMethods {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JAVA";

        if (s1 == s2) {
            System.out.println("Ref same");
        } else {
            System.out.println("ref !same");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Value is same");
        } else {
            System.out.println("value is !same");
        }

    }
}
