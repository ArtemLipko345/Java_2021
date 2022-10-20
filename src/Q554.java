import java.util.Scanner;

public class Q554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        System.out.println(numOfCirclePieces(lines));
    }
    public static int numOfCirclePieces(int lines){
        if(lines == 0){
            return 0;
        }
        if(lines == 1){
            return 2;
        }

        return numOfCirclePieces(lines - 1) + lines;
    }

}
