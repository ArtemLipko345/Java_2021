import java.util.Scanner;

public class Q439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double processors = scanner.nextInt();
        double percentage = scanner.nextInt();
        double totalTime = 0;
        totalTime = 100 * processors / (percentage * processors + 100 - percentage);
        System.out.println(totalTime);
    }
}
