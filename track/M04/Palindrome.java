
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char strArr[] = str.toCharArray();
        char revArr[] = new char[strArr.length];
        int j = 0;
        for (int i = revArr.length - 1; i >= 0; i--) {
            revArr[i] = strArr[j];
            j++;
        }
        String rev = new String(revArr);
        System.out.println("Reverse: " + rev);
        System.out.println("Is Palindrome? " + str.equalsIgnoreCase(rev));

    }
}
