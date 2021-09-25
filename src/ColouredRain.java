import java.util.Scanner;

public class ColouredRain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hills = scanner.nextInt();
        int badBridges = 0;
        int x[][] = new int[hills][hills];
        int y[] = new int[hills];
        for (int i = 0; i < hills; i++){
            for (int g = 0; g < hills; g++) {
                x[i][g] = scanner.nextInt();
            }
        }
        for (int i = 0; i < hills; i++) {
            y[i] =  scanner.nextInt();
        }
        for (int i = 0; i < hills; i++){
            for (int g = 0; g < hills; g++) {
                if (x[i][g] == 1) {
                    if (y[i] != y[g]) {
                        badBridges++;
                    }
                }
            }
        }
        System.out.println(badBridges / 2);
    }
}
