import java.util.Random;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by Anthony on 10/09/2017.
 */
public class SortTest {
    @Test
    public void test() {
        int[] array = new int[150];
        Random rand = new Random();

        for (int i = 0; i < 150; i++) {
            array[i] = rand.nextInt(99);
            System.out.print(array[i] + " ");
        }

        int[] data0 = array.clone();
        int[] data1 = array.clone();
        int[] data2 = array.clone();
        int[] data3 = array.clone();
        int[] data4 = array.clone();
        int[] data5 = array.clone();

        BubbleSort bubbleSort = new BubbleSort();
        HeapSort heapSort = new HeapSort();
        QuickSort quickSort = new QuickSort();
        CombSort combSort = new CombSort();
        CocktailSort cocktailSort = new CocktailSort();
        StandartSort standartSort = new StandartSort();

        standartSort.sort(data0);

        bubbleSort.sort(data1);
        ArrayEquals(data0, data1);

        heapSort.sort(data2);
        ArrayEquals(data0, data2);

        quickSort.sort(data3);
        ArrayEquals(data0, data3);

        combSort.sort(data4);
        ArrayEquals(data0, data4);

        cocktailSort.sort(data5);
        ArrayEquals(data0, data5);
    }

    public void ArrayEquals(int[] expected, int[] actual){
        assertEquals(expected.length, actual.length);

        for(int i = 0; i < expected.length; i++){
            assertEquals(expected[i], actual[i]);
        }
    }

}
