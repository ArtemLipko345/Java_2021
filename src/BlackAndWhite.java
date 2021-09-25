import java.util.Scanner;

public class BlackAndWhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int lines = scanner.nextInt();
        String[] numbers1 = new String[lines];
        String[] numbers2 = new String[lines];
        char[][] answer = new char[lines][length];
        scanner.nextLine();
        for(int i = 0; i < lines; i++){
            numbers1[i] = scanner.nextLine();
        }
        for(int i = 0; i < lines; i++){
            numbers2[i] = scanner.nextLine();
        }
        String rules = scanner.nextLine();
        for(int i = 0; i < lines; i++){
            for(int j = 0; j < length; j++){
                if(numbers1[i].charAt(j) == '0'){
                    if(numbers2[i].charAt(j) == '0'){
                        answer[i][j] = rules.charAt(0);
                    } else {
                        answer[i][j] = rules.charAt(1);
                    }
                } else {
                    if(numbers2[i].charAt(j) == '0'){
                        answer[i][j] = rules.charAt(2);
                    } else {
                        answer[i][j] = rules.charAt(3);
                    }
                }
            }
        }
        for(int i = 0; i < lines; i++){
            System.out.println();
            for (int j = 0; j < length; j++) {
                System.out.print(answer[i][j]);
            }
        }
    }
}
