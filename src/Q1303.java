import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Q1303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> stack = new LinkedList<>();

        int length = scanner.nextInt();
        scanner.nextLine();
        String brackets = scanner.nextLine();
        boolean ifCorrect = true;


        for (int i = 0; i < length; i++) {
            if(brackets.charAt(i) == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '['){
                stack.add(brackets.charAt(i));
            } else {
                if(stack.size() == 0){
                    if(brackets.charAt(i) - 1 == stack.peekLast() || brackets.charAt(i) - 2 == stack.peekLast()){
                       stack.removeLast();
                    } else {
                        ifCorrect = false;
                    }
                }
            }
        }

        if(ifCorrect && stack.size() == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
