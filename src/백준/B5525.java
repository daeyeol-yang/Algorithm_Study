package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int size = Integer.parseInt(br.readLine());

        String s = br.readLine();
        char [] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        sb.append('I');
        for (int i = 0; i < N; i++) {
            sb.append('O').append('I');
        }
        String s1 = sb.toString();

        int count=0;

        boolean check=false;

        for (int i = 0; i < size-s1.length()+1; i++) {
            if(arr[i]==s1.charAt(0)){
                for (int j = 0; j < s1.length(); j++) {
                    if(arr[i+j]!=s1.charAt(j)){
                        check=true;
                        break;
                    }

                }
                if(!check){
                    count++;
                }
            }
            check=false;

        }
        System.out.println(count);
    }
}
