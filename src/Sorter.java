import java.util.Arrays;

public class Sorter {
    public static int[] insertionSort (int[] array){
        int a = 0;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > sortedArray[i]) {
                    sortedArray[j] = array[i];
                }
            }
        }
        return sortedArray;
    }
    public static int[] selectionSort (int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int max = Integer.MIN_VALUE;
        int minPosition = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i; j < sortedArray.length; j++) {
                if(sortedArray[j] > max){
                    max = sortedArray[j];
                    minPosition = j;
                }
            }
            sortedArray[minPosition] = sortedArray[i];
            sortedArray[i] = max;
            max = Integer.MIN_VALUE;
        }
        return sortedArray;
    }

}
