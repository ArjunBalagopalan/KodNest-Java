
import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("NOT Anagram");
            return;
        }
        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

    }
}
