import java.util.Scanner;

public class Q924 {
    public static void main(String[] args) {
        Character pattern[][] = new Character[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            String a = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                pattern[i][j] = a.charAt(j);
            }
        }

        boolean containsSquare = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(pattern[i][j].equals(pattern[i][j + 1]) && pattern[i][j].equals(pattern[i + 1][j]) && pattern[i][j].equals(pattern[i + 1][j + 1])){
                    containsSquare = true;
                }
            }
        }

        if(containsSquare){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
