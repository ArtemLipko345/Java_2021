import java.util.Scanner;

public class Q519 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int min = 10;
        int minIndex = 0;
        int max = -1;
        int maxIndex = 0;
        int zeroCount = 0;
        int lowest[] = new int[number.length()];
        int largest[] = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            lowest[i] = number.charAt(i) - '0';
            largest[i] = number.charAt(i) - '0';
        }
            for (int i = 0; i < number.length(); i++) {
                for (int j = 0; j < number.length(); j++) {
                    if(i != 0){
                        if(lowest[j] < min){
                            min = lowest[j];
                            minIndex = j;
                        }
                    } else {
                        if(lowest[j] != 0 && lowest[j] < min){
                            min = lowest[j];
                            minIndex = j;
                        }
                    }

                }
                System.out.print(min);
                min = 10;
                lowest[minIndex] = 10;
            }
            System.out.print(" ");

            for (int i = 0; i < number.length(); i++) {
                for (int j = 0; j < number.length(); j++) {
                    if(largest[j] > max){
                        max = largest[j];
                        maxIndex = j;
                    }
                }
                System.out.print(max);
                max = -1;
                largest[maxIndex] = -1;
            }
    }
}
