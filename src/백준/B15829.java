package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());

        String s1 = br.readLine();

        BigInteger sum = new BigInteger("0");


        for (int i = 0; i < s; i++) {
            int n = s1.charAt(i)-'a'+1;
            sum=sum.add(BigInteger.valueOf(n).multiply(BigInteger.valueOf(31).pow(i)));

        }

        System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
    }
}
