import java.util.Scanner;

public class Q336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        System.out.println(solve(numbers));
    }
    public static int solve(String numbers){
        int floors = 0;
        int a = 0;
        int b = 0;
        char up;
        int minFloor = 0;
        int maxFloor = 0;
        for (int i = 0; i < numbers.length(); i ++){
            if (numbers.charAt(i) == '1'){
                a++;
            }else{
                b++;
            }
        }
        if (a > b){
            up = '1';
        } else {
            up = '2';
        }

        for (int i = 0; i < numbers.length(); i ++){
            if (numbers.charAt(i) == up){
                floors++;
            } else {
                floors--;
            }
            if(floors < minFloor){
                minFloor = floors;
            }
            if(floors > maxFloor){
                maxFloor = floors;
            }
        }
        if(minFloor < 0){
            minFloor *= -1;
        }
//        System.out.println(maxFloor);
//        System.out.println(minFloor);
        return maxFloor + minFloor + 1;
    }
}
