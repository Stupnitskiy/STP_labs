import java.util.Random;

/**
 * Created by Anthony on 09/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        int [] array = new int[150];
        Random rand = new Random();

        for (int i = 0; i < 150; i++) {
            array[i] = rand.nextInt(99);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] copyForSort0 = array.clone();
        int[] copyForSort1 = array.clone();
        int[] copyForSort2 = array.clone();
        int[] copyForSort3 = array.clone();
        int[] copyForSort4 = array.clone();
        int[] copyForSort5 = array.clone();

        BubbleSort bubbleSort = new BubbleSort();
        HeapSort heapSort = new HeapSort();
        QuickSort quickSort = new QuickSort();
        CombSort combSort = new CombSort();
        CocktailSort cocktailSort = new CocktailSort();
        StandartSort standartSort = new StandartSort();

        bubbleSort.sort(copyForSort0);
        heapSort.sort(copyForSort1);
        quickSort.sort(copyForSort2);
        combSort.sort(copyForSort3);
        cocktailSort.sort(copyForSort4);
        standartSort.sort(copyForSort5);
    }
}
