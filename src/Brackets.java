import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        int counter = 0;
        boolean ifCorrect = true;

        for (int i = 0; i < brackets.length(); i++) {
            if(brackets.charAt(i) == '('){
                counter++;
            } else {
                counter--;
            }
            if(counter < 0){
                ifCorrect = false;
            }
        }

        if(counter != 0 || !ifCorrect){
            System.out.println("Wrong");
        } else {
            System.out.println("Correct");
        }
    }

}
