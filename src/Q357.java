import java.util.Scanner;

public class Q357 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        char even = 0;
        char odd = 0;
        for (int i = 0; i < number.length(); i++){
            if(i%2 == 0){
                even += number.charAt(i) - '0';
            } else {
                odd += number.charAt(i) - '0';
            }
        }
        if((odd - even)%11 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
