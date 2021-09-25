import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = 0;

        if (a.charAt(1) % 2 == 0) {
            if (a.charAt(0) % 2 != 0) {
                System.out.println("WHITE");
            } else {
                System.out.println("BLACK");
            }
        } else {
            if (a.charAt(0) % 2 != 0) {
                System.out.println("BLACK");
            } else {
                System.out.println("WHITE");
            }
        }
    }
}
