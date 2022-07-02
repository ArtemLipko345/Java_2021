import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RPNInterviewBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        int length = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < length; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println(A);
        int answer = evalRPN(A);
        System.out.println(answer);
    }
    public static int evalRPN(ArrayList<String> A) {
        List<Integer> list = new ArrayList<>();
        int lastIndex = -1;

        for(int i = 0; i < A.size(); i++){
            System.out.println(list);
            if(A.get(i).charAt(0) >= 48 || (A.get(i).length() > 1 && A.get(i).charAt(1) >= 48)){
                list.add(Integer.valueOf(A.get(i)));
                lastIndex++;
                System.out.println(A.get(i));
            } else {
                switch (A.get(i)){
                    case "+":
                        list.set(lastIndex - 1, list.get(lastIndex) + list.get(lastIndex -1));
                        list.remove(lastIndex);
                        lastIndex--;
                        break;
                    case "-":
                        list.set(lastIndex - 1, list.get(lastIndex) - list.get(lastIndex -1));
                        list.remove(lastIndex);
                        lastIndex--;
                        break;
                    case "/":
                        list.set(lastIndex - 1, list.get(lastIndex) / list.get(lastIndex -1));
                        list.remove(lastIndex);
                        lastIndex--;
                        break;
                    case "*":
                        list.set(lastIndex - 1, list.get(lastIndex) * list.get(lastIndex -1));
                        list.remove(lastIndex);
                        lastIndex--;
                        break;
                    default:
                }
            }
        }
        return list.get(0);
    }
}
