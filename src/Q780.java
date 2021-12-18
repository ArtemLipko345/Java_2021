import java.util.Scanner;

public class Q780 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalGoals = scanner.nextInt();
        int i = 1;
        while(totalGoals > 0){
            totalGoals -= i;
            i++;
        }
        System.out.println(i -= 1);
    }
}
