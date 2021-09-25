import java.util.Scanner;

public class Q691 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String x[] = new String[n];
        String y[] = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String letters = "ABCEHKMOPTXY";
            if (letters.contains(Character.toString(x[i].charAt(0)))) {
                if ('0' <= x[i].charAt(1) && x[i].charAt(1) <= '9') {
                    if ('0' <= x[i].charAt(2) && x[i].charAt(2) <= '9') {
                        if ('0' <= x[i].charAt(3) && x[i].charAt(3) <= '9') {
                            if (letters.contains(Character.toString(x[i].charAt(4)))) {
                                if (letters.contains(Character.toString(x[i].charAt(5)))) {
                                    y[i] = "Yes";
                                } else {
                                    y[i] = "No";
                                }
                            } else {
                                y[i] = "No";
                            }
                        } else {
                            y[i] = "No";
                        }
                    } else {
                        y[i] = "No";
                    }
                } else {
                    y[i] = "No";
                }
            } else {
                y[i] = "No";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(y[i]);
        }
    }
}
