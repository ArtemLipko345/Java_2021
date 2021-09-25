import java.util.Scanner;

public class Maze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [][]x = new int[size][size];

        for(int i = 0; i < (size + 1) / 2; i++){
            if(i % 2 == 0){
                for(int g = 0; g < size; g++){
                    x[i][g] = 1;
                    x[size - i - 1][g] = 1;
                }
            }
        }
        for(int i = 0; i < size; i++){
            for(int g = 0; g < size; g++){
                if(x[i][g] == 1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
