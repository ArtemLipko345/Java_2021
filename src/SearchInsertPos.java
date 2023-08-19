import java.util.Scanner;

public class SearchInsertPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] x = new int[len];
        for(int i = 0; i < len; i++){
            x[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        int ans = searchInsert(x, target);
        System.out.println(ans);
    }




    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        if(target <= nums[0]){
            return 0;
        }
        while(end - start > 1){
            int m = (end + start) / 2;
            if(nums[m] < target){
                start = m;
            } else {
                end = m;
            }

        }
        return end;
    }
}
