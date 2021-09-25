import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 1;
        int x3 = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1){
            System.out.println(1);
        } else {
            for (int i = 0; i < a - 1; i++) {
                x3 = x1 + x2;
                x1 = x2;
                x2 = x3;
            }
            System.out.println(x3);
        }
    }
}
