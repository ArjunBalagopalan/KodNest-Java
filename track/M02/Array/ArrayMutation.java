
public class ArrayMutation {

    public static void main(String[] args) {
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        // 1. Create snapshot and copy values
        int[] snapshot = new int[readings.length];
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }

        // 2. Update readings array
        readings[updateIndex] = newValue;

        // 3. Print Snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        // 4. Print Updated
        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");
        }
    }
}
