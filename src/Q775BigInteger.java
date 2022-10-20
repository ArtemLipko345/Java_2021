import com.sun.jdi.IntegerValue;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Q775BigInteger {
    static HashMap<BigInteger, Integer> numberToCount = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nAndM = scanner.nextLine();
        BigInteger x = BigInteger.ZERO;

        String[] a = nAndM.split(" ");

        String nStr = a[0];
        String mStr = a[1];

        BigInteger n = new BigInteger(nStr);
        BigInteger m = new BigInteger(mStr);

        BigInteger numbers[] = new BigInteger[m.intValue()];

        HashSet<BigInteger> setTwo = new HashSet<>();
        setTwo.add(BigInteger.ONE);
        BigInteger d = BigInteger.ONE;
        
        for (int i = 1; i < 332; i++) {
            d = (d.multiply(BigInteger.TWO));
            setTwo.add(d);
        }

        BigInteger minCollatz = BigInteger.ZERO;
        BigInteger minCollatzNumber = BigInteger.ZERO;
        BigInteger nCollatz = collatzNumber(n);

        for (BigInteger i = n; i.compareTo(m.add(n)) < 0; i = i.add(BigInteger.ONE)) {
            numbers[i.subtract(n).intValue()] = i;
        }

        boolean ifMersenneNumber = false;
        while(!ifMersenneNumber) {
            for (BigInteger i = n; i.compareTo(m.add(n)) < 0; i = i.add(BigInteger.ONE)) {
                if(setTwo.contains(numbers[i.subtract(n).intValue()].add(BigInteger.ONE))){
                    if(collatzNumber(numbers[i.subtract(n).intValue()]).compareTo(nCollatz) < 0){
                        ifMersenneNumber = true;
                    }
                }


                BigInteger collatzNumber = collatzNumber(numbers[i.intValue()]);
                numbers[i.subtract(n).intValue()] = collatzNumber;
            }
        }


    }
    public static BigInteger collatzNumber(BigInteger a){
        if(a.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }


        if(a.remainder(BigInteger.TWO).equals(BigInteger.ZERO)){
            a = a.divide(BigInteger.TWO);
        } else {
            a = a.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
        }

        return a;

    }

}
