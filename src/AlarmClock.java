import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b > a) {
            System.out.println(b - a);
        } else {
            if (a == b) {
                System.out.println(0);
            }
            if (a > b) {
                System.out.println(12 - (a - b));
            }
        }
    }
}
