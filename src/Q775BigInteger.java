import java.math.BigInteger;
import java.util.Scanner;

public class Q775BigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nAndM = scanner.nextLine();

        String[] a = nAndM.split(" ");

        String nStr = a[0];
        String mStr = a[1];

        BigInteger n = new BigInteger(nStr);
        BigInteger m = new BigInteger(mStr);

        int minCollatz = Integer.MAX_VALUE;
        BigInteger minCollatzNumber = BigInteger.ZERO;
        int nCollatz = collatzNumber(n);

        for (BigInteger i = n; i.compareTo(m.add(n)) == -1; i = i.add(BigInteger.ONE)) {
            int collatzNumber = collatzNumber(i);
            if(collatzNumber < minCollatz){
                minCollatz = collatzNumber;
                minCollatzNumber = i;
            } else {
                if(collatzNumber == minCollatz){
                    if(i.compareTo(minCollatzNumber) == -1){
                        minCollatz = collatzNumber;
                        minCollatzNumber = i;
                    }
                }
            }
        }
        if(minCollatz < nCollatz){
            System.out.println(minCollatzNumber);
        } else {
            System.out.println("NO");
        }
    }
    public static int collatzNumber(BigInteger a){
        int counter = 0;

        while(!a.equals(BigInteger.ONE)){
            if(a.remainder(BigInteger.TWO).equals(BigInteger.ZERO)){
                a = a.divide(BigInteger.TWO);
            } else {
                a = a.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            }
            counter++;
        }
        return counter;
    }

}
