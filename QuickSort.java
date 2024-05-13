/*
* This program uses the quick sort algorithm 
*
* @author  Emmanuel FN 
* @version 1.0
* @since   2024-05-13
*/


import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    static final int MIN = 0;
    static final int MAX = 100;
    static final int ARRAY_SIZE = 100;

    public static void main(String[] args) {
        int[] numberArray = new int[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            numberArray[i] = random.nextInt(MAX + 1);
        }

        System.out.println("Before:");
        System.out.println(Arrays.toString(numberArray));

        quickSort(numberArray, 0, ARRAY_SIZE - 1);

        System.out.println("After:");
        System.out.println(Arrays.toString(numberArray));
        
        System.out.println("\nDone.");
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
