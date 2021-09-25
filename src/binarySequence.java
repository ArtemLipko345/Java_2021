import java.util.Scanner;

public class binarySequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = 0;
        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0') {
                b++;
            } else {
                System.out.print((char)(97 + b));
                b = 0;
            }
        }
    }
}
