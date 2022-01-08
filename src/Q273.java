import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        Set<String> uniqueNumbers = new HashSet<>();
        System.out.println(findKDigitNumbers(n, 3, "", uniqueNumbers));
    }
    public static int findKDigitNumbers(String n, int k, String x, Set<String> uniqueNumbers){
        if(n.length() < k){
            return uniqueNumbers.size();
        }
        if(k == 0){
            if(x.charAt(0) != '0'){
                uniqueNumbers.add(x);
            }
            return uniqueNumbers.size();
        }
        findKDigitNumbers(n.substring(0,n.length() - 1),k - 1,n.charAt(n.length() - 1) + x, uniqueNumbers);
        findKDigitNumbers(n.substring(0,n.length() - 1), k, x, uniqueNumbers);

        return uniqueNumbers.size();
    }
}