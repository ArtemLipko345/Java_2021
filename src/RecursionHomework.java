import java.util.Scanner;

public class RecursionHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String answer = recursion(i);
        System.out.println(answer);
    }

    public static String recursion(int i) {
        if (i < 1){
            return "NO";
        }
        if (i / 2 == 1 && i % 2 == 0) {
            return "YES";
        } else {
            return recursion(i / 2);
        }
    }
}
