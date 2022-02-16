import java.util.Scanner;

public class RecursionHomework {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();
        long startTime = System.nanoTime();
        System.out.println(fibonacciNumber(a));
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime/1000 + " ms");
    }

    public static String recursion(int i) {
        if (i == 1) {
            return "YES";
        } else {
            if(i % 2 == 0){
                return recursion(i / 2);
            } else {
                return "NO";
            }
        }
    }

    public static String ifPowerOf2Check(int i){
        return doIfPowerOf2Check(i, 1);
    }

    public static String doIfPowerOf2Check(int i, int a){
        if(i == a){
            return "YES";
        } else {
            if (a < i){
                return doIfPowerOf2Check(i, a * 2);
            } else {
                return "NO";
            }
        }
    }
    public static int digitSum(int i){
        return doDigitSum(i, 0);
    }

    public static int doDigitSum(int i, int sum){
        if(i > 10){
            sum += i % 10;
            return doDigitSum(i / 10, sum);
        } else {
            return sum + i % 10;
        }
    }

    public static void flipNumber(int i){
        System.out.print(i % 10 + " ");
        if(i > 10) {
            flipNumber(i / 10);
        }
    }

    public static void displayNumber(int i){
        if(i > 10) {
            displayNumber(i / 10);
        }
        System.out.print(i % 10 + " ");
    }

    public static String ifPrimeNumber(int i){
        return doIfPrimeNumber(i, 2);
    }

    public static String doIfPrimeNumber(int i, int a){
        if(a <= Math.sqrt(i)){
            if(i % a == 0){
                return "NO";
            }
            return doIfPrimeNumber(i, a + 1);
        }
        return "YES";
    }

    public static void listPrimeFactors(int i){
        doIfListPrimeFactors(i, 2);
    }

    public static void doIfListPrimeFactors(int i, int a){
        if (a <= Math.sqrt(i)) {
            if (i % a == 0) {
                System.out.print(a + " ");
                doIfListPrimeFactors(i / a, a);
            } else {
                doIfListPrimeFactors(i, a + 1);
            }
        } else {
            System.out.print(i);
        }
    }
    public static String ifPalindrome(String i){
        return doIfPalindrome(i, 0);
    }

     public static String doIfPalindrome(String i, int a){
        if(i.charAt(a) == i.charAt(i.length() - a - 1)){
            if(a == i.length() / 2){
                return "YES";
            } else {
                return doIfPalindrome(i, a + 1);
            }
        } else {
            return "NO";
        }
     }

     public static int biggestNumber(){
        int a = scanner.nextInt();
        int max = 0;
        if(a != 0){
            int b = biggestNumber();
            if(a > b){
                max = a;
            } else {
                max = b;
            }
        }
        return max;
     }

     public static void fibonacciSequence(int a, int b, int c, int d){
        int x;
         System.out.print(a + " ");
         x = a + b;
         if(d == c){
             return;
         }
         d++;
         fibonacciSequence(b, x, c, d);
     }

     public static long fibonacciNumber(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
     }

     public static long fibonacciNumberDynamic(int n){
        long a[] = new long[n + 1];
        a[0] = 1;
        if(n != 0){
            a[1] = 1;
        }

         for (int i = 2; i < n + 1; i++) {
             a[i] = a[i - 1] + a[i - 2];
         }
         return a[n];
     }
}
