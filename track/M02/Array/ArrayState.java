
public class ArrayState {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        // 1. Create snapshot and copy values manually
        int[] snapshot = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // 2. Create liveView alias and update through it
        int[] liveView = original;
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        // 3. Display Original
        System.out.print("Original: ");
        for (int val : original) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 4. Display Snapshot
        System.out.print("Snapshot: ");
        for (int val : snapshot) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 5. Reference Comparison
        System.out.println("Same object: " + (liveView == original));

        // 6. Validate requestedIndex safely
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
