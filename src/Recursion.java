import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(recursion2(m, n));
    }
    public static void recursion(int i, int j){
        if(i == j - 1){
            return;
        }
        System.out.println(i);
        recursion(i - 1, j);
    }
    public static int recursion2(int m, int n){
        if(m == 0){
            return n + 1;
        }
        if(m > 0 && n == 0){
            return recursion2(m - 1, 1);
        }
        if(m > 0 && n > 0){
            return recursion2(m - 1,recursion2(m, n - 1));
        }
        return 0;
    }
}
