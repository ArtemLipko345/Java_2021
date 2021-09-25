import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int w = scanner.nextInt();
        int d = scanner.nextInt();
        int P = scanner.nextInt();
        int total = (N * (N - 1) / 2) * w;
        int difference = total - P;
        if(difference == 0){
            System.out.println(N);
        } else {
            System.out.println(difference / d);
        }
    }
}
