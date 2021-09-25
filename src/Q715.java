import java.util.Scanner;

public class Q715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int columns = scanner.nextInt();
        int c = 0;
        String x[] = new String[lines];
        String y[] = new String[lines];
        scanner.nextLine();
        for (int i = 0; i < lines; i++){
            x[i] = scanner.nextLine();
        }
        scanner.nextLine();
        for (int i = 0; i < lines; i++){
            y[i] = scanner.nextLine();
        }
        for (int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++){
               if(x[i].charAt(j) == y[i].charAt(j)){
                   c++;
               }
            }
        }
        System.out.println(c);
    }
}