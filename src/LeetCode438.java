import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeetCode438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String p = scanner.nextLine();
        System.out.println(findAnagrams(s, p));

    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramsIndex = new ArrayList<>();

        for(int i = 0; i < s.length() - p.length() + 1; i++){
            if(p.contains(String.valueOf(s.charAt(i)))){
                String a = s.substring(i, i + p.length());
                char[] pArray = p.toCharArray();
                char[] aArray = a.toCharArray();
                Arrays.sort(pArray);
                Arrays.sort(aArray);
                if(Arrays.equals(pArray, aArray)){
                    anagramsIndex.add(i);
                }
            }
        }
        return anagramsIndex;
    }
}
