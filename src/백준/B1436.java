package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = (long) Integer.parseInt(br.readLine());
        Long start = 0L;

        while (true){
            start++;
            String s =String.valueOf(start);
                if(s.contains("666")){
                    n--;
                }

            if(n==0){
                break;
            }
        }
        System.out.println(start);
    }
}
