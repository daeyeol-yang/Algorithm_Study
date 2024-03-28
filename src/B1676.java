import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger bigInteger = new BigInteger("1");

        int solution =0;
        for (int i = 1; i <= N; i++) {
            bigInteger=bigInteger.multiply(BigInteger.valueOf(i));
        }

        String s = String.valueOf(bigInteger);
        for (int i = 0; i < s.length()-1 ; i++) {
            if(s.charAt(s.length()-1-i)!='0'){
                solution=i;
                break;
            }
        }
        System.out.println(solution);
    }


}
