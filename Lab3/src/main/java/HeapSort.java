import java.util.Arrays;

/**
 * Created by Anthony on 09/25/2017.
 */

public class HeapSort implements ISort{

    public void sort(int[] data) {

        long timeout= System.nanoTime();
        int n = data.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(data, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;

            // call max heapify on the reduced heap
            heapify(data, i, 0);
        }

        timeout = System.nanoTime() - timeout;
        System.out.format("Nanoseconds for HeapSort: %10d %n", timeout);
    }
    private void heapify(int data[], int n, int i) {
        int largest = i;  // Initialize largest as root
        int l = 2 * i + 1;  // left = 2*i + 1
        int r = 2 * i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && data[l] > data[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && data[r] > data[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = data[i];
            data[i] = data[largest];
            data[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(data, n, largest);
        }
    }
}
