
import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int aux;
        boolean swap = true;

        while (swap) {
            swap = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap = true;
                    aux = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = aux;
                    System.out.println("-" + Arrays.toString(arr));
                }
            }
            if (!swap) 
                break;
        }
        return arr;
    }
}
