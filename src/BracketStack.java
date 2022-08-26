import java.util.Scanner;
import java.util.Stack;

public class BracketStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        String bracket = scanner.nextLine();
        boolean ifCorrect = true;

        for (int i = 0; i < bracket.length(); i++) {
            if(bracket.charAt(i) == '('){
                stack.push('C');
            } else {
                if(!stack.empty()){
                    stack.pop();
                } else {
                    ifCorrect = false;
                }
            }
        }

        if(ifCorrect && stack.empty()){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
