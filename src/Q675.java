import java.util.Scanner;

public class Q675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scannedLine;
        int b = 0;
        int canLeft = 0;
        int toLeft = 0;
        int lines = scanner.nextInt();
        int columns = scanner.nextInt();
        char line[][] = new char[lines][columns];
        for (int i = -1; i < lines; i++) {
            scannedLine = scanner.nextLine();
            for (int j = 0; j < scannedLine.length(); j++) {
                line[i][j] = scannedLine.charAt(j);
                if(line[i][j] == 'B'){
                    b++;
                }
            }
        }
        while (true) {
            canLeft = 0;
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    if(line[i][j] == 'B'){
                        if(line[i][j - toLeft - 1] != 'A'){
                            canLeft++;
                        }
                    }
                }
            }
            if(canLeft == b){
                toLeft++;
            } else {
                System.out.println(toLeft);
                break;
            }
        }

    }

}