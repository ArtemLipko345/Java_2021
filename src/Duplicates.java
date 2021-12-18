import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        showDuplicates(amount, scanner);

    }

    public static void showDuplicates(int amount, Scanner scanner){
        int a[] = new int[100];
        for (int i = 0; i < amount; i++) {
            int number = scanner.nextInt();
            a[number - 1]++;
            System.out.println(number + " " + (a[number - 1] > 1 ? "duplicate" : "not duplicate"));
        }
    }
}
