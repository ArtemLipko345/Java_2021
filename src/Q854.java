import java.util.Scanner;

public class Q854 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomTemp = scanner.nextInt();
        int condTemp = scanner.nextInt();
        scanner.nextLine();
        String action = scanner.nextLine();

        if("auto".equals(action)){
            System.out.println(condTemp);
        }
        if("heat".equals(action)){
            if(roomTemp > condTemp){
                System.out.println(roomTemp);
            } else {
                System.out.println(condTemp);
            }
        }
        if("freeze".equals(action)){
            if(roomTemp < condTemp){
                System.out.println(roomTemp);
            } else {
                System.out.println(condTemp);
            }
        }
        if("fan".equals(action)){
            System.out.println(roomTemp);
        }
    }
}
