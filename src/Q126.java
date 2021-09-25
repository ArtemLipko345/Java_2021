import java.util.Scanner;

public class Q126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squares = scanner.nextInt();
        int allways = (squares * squares * squares - 3 * squares * squares + 2 * squares) / 6;
        int z[][] = new int[squares][squares];
        int c[] = new int[allways];
        int b[] = new int[allways];
        int a[] = new int[allways];
        int length = 0;
        int smallest = Integer.MAX_VALUE;
        int ways = 0;
        for (int i = 0; i < squares; i++){
            for (int g = 0; g < squares; g++){
                z[i][g] = scanner.nextInt();
            }
        }

        for (int i = 1; i <= squares; i++){
            for (int j = i + 1; j <= squares; j++){
                for (int k = j + 1; k <= squares; k++){
                    a[ways] = i - 1;
                    b[ways] = j - 1;
                    c[ways] = k - 1;
                    ways++;
                }
            }
        }
        for(int i = 0; i < ways; i++) {
            length = 0;
            length += z[a[i]][b[i]];
            length += z[b[i]][c[i]];
            length += z[c[i]][a[i]];
            if(length < smallest){
                smallest = length;
            }
        }
        System.out.println(smallest);
    }
}
