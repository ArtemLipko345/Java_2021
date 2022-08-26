import java.util.Scanner;

public class Q775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int ans = solve(n, m);
        if(ans == -1){
            System.out.println("NO");
        } else {
            System.out.println(ans);
        }
    }
    public static int collatzNumber(int a){
        int counter = 0;
        while(a != 1){
            if(a % 2 == 0){
                a = a / 2;
            } else {
                a = 3 * a + 1;
            }
            counter++;
        }
        return counter;
    }
    public static int solve(int n, int m){
        int nCollatz = collatzNumber(n);
        int minCollatz = Integer.MAX_VALUE;
        int minCollatzNumber = 0;

        for (int i = n + 1; i < n + m + 1; i++) {
            if(collatzNumber(i) < minCollatz){
                minCollatz = collatzNumber(i);
                minCollatzNumber = i;
            } else {
                if(collatzNumber(i) == minCollatz){
                    if(i < minCollatzNumber){
                        minCollatz = collatzNumber(i);
                        minCollatzNumber = i;
                    }
                }
            }

        }
        if(minCollatz < nCollatz){
            return minCollatzNumber;
        } else {
            return -1;
        }
    }
}
