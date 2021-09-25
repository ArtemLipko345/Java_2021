import java.util.Scanner;

public class Q185 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int horses = scanner.nextInt();
        int horse = scanner.nextInt();
        int x[] = new int[10000];
        int y[] = new int[10000];
        int z[][] = new int[horses][horses];

        do {
            x[i] = scanner.nextInt();
            if (x[i] == 0) {
                break;
            }
            y[i] = scanner.nextInt();
            i++;
        } while (true);

        for (int j = 0; j < i; j++){
            z[x[j] - 1][y[j] - 1] = 1;
        }

        for(int j = 0; j < horses; j++){
            for(int k = 0; k < horses; k++){
                System.out.print(z[j][k] + " ");
            }
            System.out.println();
        }
    }
}
