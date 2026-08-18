
class ArraySearch {

    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                System.out.println("Element Found: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element Not Found");
        }
    }
}

public class Target {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 60;
        ArraySearch a1 = new ArraySearch();
        a1.search(arr, key);
    }
}
