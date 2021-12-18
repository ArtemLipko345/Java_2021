import java.util.Arrays;

public class Sorter {
    public static int[] insertionSort (int[] array){
        int a = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            j = i;
            a = array[i];
            while(j > 0 && array[j - 1] > a){
                array[j] = array[j - 1];
                j -= 1;
            }
            array[j] = a;
        }
        return array;
    }
    public static int[] selectionSortReverse (int[] array){
        int max = Integer.MIN_VALUE;
        int minPosition = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j] > max){
                    max = array[j];
                    minPosition = j;
                }
            }
            array[minPosition] = array[i];
            array[i] = max;
            max = Integer.MIN_VALUE;
        }
        return array;
    }
    public static int[] selectionSort (int[] array){
        int minPosition = 0;
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {
                if(array[j] < min){
                    min = array[j];
                    minPosition = j;
                }
            }
            array[minPosition] = array[i];
            array[i] = min;
        }
        return array;
    }
}
