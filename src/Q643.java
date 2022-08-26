import java.util.Scanner;

public class Q643 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n + function(n));

    }
    public static int function(int n){
        int nBinarySum = 0;
        while (n != 1){
            nBinarySum += n % 2;
            n = n / 2;
        }
        return nBinarySum + 1;
    }
}
