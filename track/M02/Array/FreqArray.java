
class Freq {

    int count = 0;

    void count(int ref[], int key) {
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                count++;
            }
        }
        System.out.println("Count of " + key + ": " + count);
    }
}

public class FreqArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 40, 10};
        int key = 10;
        Freq f1 = new Freq();
        f1.count(arr, key);
    }
}
