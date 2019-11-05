package BigInteger;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        BigInteger number1, number2;

        String n1 = sc.next();
        String n2 = sc.next();
        if (n1.length() <= 200 && n2.length() <= 200) {
            number1 = new BigInteger(n1);
            number2 = new BigInteger(n2);
            System.out.println(number1.add(number2));
            System.out.println(number1.multiply(number2));

        }
    }
}