import java.util.Arrays;
import java.util.Scanner;

public class Q759 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int capacity = scanner.nextInt();
        int values[] = new int[amount];
        int best1 = 0;

        for (int i = 0; i < amount; i++) {
            values[i] = scanner.nextInt();
        }
        int best[] = selectionSort(values);
        for (int i = 0; i < capacity; i++) {
            best1 += best[i];
        }
        System.out.println(best1);
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
