import java.util.Scanner;

public class Q579 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int number;
        int positiveNumbers[] = new int[length];
        int negativeNumbers[] = new int[length];
        int positiveSum = 0;
        int negativeSum = 0;
        int negativeAmount = 0;
        int positiveAmount = 0;
        for (int i = 0; i < length; i++) {
            number = scanner.nextInt();
            if(number == 0){
                continue;
            }
            if(number > 0){
                positiveNumbers[positiveAmount] = i + 1;
                positiveAmount++;
                positiveSum += number;
            } else {
                negativeNumbers[negativeAmount] = i + 1;
                negativeAmount++;
                negativeSum += number;
            }
        }
        negativeSum *= -1;
        if(negativeSum > positiveSum){
            System.out.println(negativeAmount);
            for (int i = 0; i < negativeAmount; i++) {
                System.out.println(negativeNumbers[i]);
            }
        } else {
            System.out.println(positiveAmount);
            for (int i = 0; i < positiveAmount; i++) {
                System.out.println(positiveNumbers[i]);
            }
        }
    }
}