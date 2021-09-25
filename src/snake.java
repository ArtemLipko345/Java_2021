import java.util.Scanner;

public class snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        if(row % 2 != 0) {
            System.out.println((row - 1) * columns + column - 1);
        } else {
            System.out.println((row) * columns - (column) );
        }
    }
}
