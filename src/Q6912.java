import java.util.Scanner;

public class Q6912 {

    final static String LETTERS = "ABCEHKMOPTXY";

    public static boolean isLetter(char c) {
        return LETTERS.contains(Character.toString(c));
    }

    public static boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String x[] = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < 1 || j > 3) {
                    if(!isLetter(x[i].charAt(j))) {
                        System.out.println("No");
                    }
                } else {
                    if(!isDigit(x[i].charAt(j))) {
                        System.out.println("No");
                    }
                }
            }
            System.out.println("Yes");
        }
    }
}
