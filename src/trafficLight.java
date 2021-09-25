import java.util.Scanner;

public class trafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int z[] = new int[n];
        for(int i = 0; i < m * 2; i++) {
            int t = scanner.nextInt();
            z[t - 1]++;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
