import java.util.Scanner;

public class numEndIn5Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a != 5) {
            int b = 25;
            int c = 0;
            a = a / 10;
            c = a * (a + 1);
            System.out.print(c);
            System.out.print(b);
        } else {
            System.out.println(25);
        }
    }
}
