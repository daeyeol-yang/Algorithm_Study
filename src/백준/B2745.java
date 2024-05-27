package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char c[] = st.nextToken().toCharArray();
        int N = Integer.parseInt(st.nextToken());

        int size = c.length;
        long sum=0;

        for (int i = 0; i < size; i++) {
            if(Character.isAlphabetic(c[i])){

                sum+= ((double)(c[i]-'A'+10)) * Math.pow(N, (double) size-1 - i);
            }else{
                sum+= ((double)(c[i]-'0') * Math.pow(N, (double) size-1 - i));

            }


        }
        System.out.println(sum);


    }
}
