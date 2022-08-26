import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class SpecialStringAgain {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int validStrings = 0;
        boolean valid = true;

        for (int i = 1; i < n + 1; i++){
            for (int j = 0; j < n - i + 1; j++) {
                for (int k = 0; k < i / 2 + 1; k++) {
                    if(s.charAt(j + k) != s.charAt(j + i - k - 1)){
                        valid = false;
                    }
                    if(k != 0 && (k != i / 2 || i % 2 == 0) && s.charAt(j + k) != s.charAt(j + k - 1)){
                        valid = false;
                    }
                }
                if(valid){
                    System.out.println(s.substring(j, j + i));
                    validStrings++;

                }
                valid = true;
            }
        }

        return validStrings;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("specialString.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

