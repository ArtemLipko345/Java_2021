
import java.util.Scanner;

public class TableAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        long recursionTime[] = new long[5];
        long dynamicTime[] = new long[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            RecursionHomework.fibonacciNumber(a[i]);
            long elapsedTime = System.nanoTime() - startTime;
            recursionTime[i] = elapsedTime/1000;
            long startTime2 = System.nanoTime();
            RecursionHomework.fibonacciNumberDynamic(a[i]);
            long elapsedTime2 = System.nanoTime() - startTime2;
            dynamicTime[i] = elapsedTime2/1000;
        }

        System.out.println();
        table(a, recursionTime, dynamicTime);
    }
    public static void line(int maxNumber, int maxDynamic, int maxNonDynamic){
        System.out.print("+");
        for (int i = 0; i < maxNumber + 1; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxDynamic + 1; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < maxNonDynamic + 1; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }
    public static void space(int length, int maxLength){
        for (int i = 0; i < maxLength - length + 1; i++) {
            System.out.print(" ");
        }
    }

    public static void table(int a[], long recursionTime[], long dynamicTime[]){
        String number = "Number";
        String dynamic = "Dynamic Time";
        String nonDynamic = "Non-Dynamic Time";
        int maxNumber = number.length();
        int maxDynamic = dynamic.length();
        int maxNonDynamic = nonDynamic.length();

        for (int i = 0; i < 5; i++) {
            if(String.valueOf(a[i]).length() > maxNumber){
                maxNumber = String.valueOf(a[i]).length();
            }
            if(String.valueOf(dynamicTime[i]).length() > maxDynamic){
                maxDynamic = String.valueOf(dynamicTime[i]).length();
            }
            if(String.valueOf(recursionTime[i]).length() > maxNonDynamic){
                maxNonDynamic = String.valueOf(recursionTime[i]).length();
            }
        }

        line(maxNumber, maxDynamic, maxNonDynamic);
        System.out.print("|Number");
        space(number.length(), maxNumber);
        System.out.print("|Dynamic Time");
        space(dynamic.length(), maxDynamic);
        System.out.print("|Non-Dynamic Time");
        space(nonDynamic.length(), maxNonDynamic);
        System.out.println("|");
        line(maxNumber, maxDynamic, maxNonDynamic);

        for (int i = 0; i < 5; i++) {
            System.out.print("|" + a[i]);
            space(String.valueOf(a[i]).length(), maxNumber);
            System.out.print("|" + dynamicTime[i]);
            space(String.valueOf(dynamicTime[i]).length(), maxDynamic);
            System.out.print("|" + recursionTime[i]);
            space(String.valueOf(recursionTime[i]).length(), maxNonDynamic);
            System.out.print("|");
            System.out.println();
        }
        line(maxNumber, maxDynamic, maxNonDynamic);
    }
}
