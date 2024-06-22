package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948 {

    public static boolean []A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A=new boolean[123456*2+1];

        for (int i = 2; i <=A.length-1 ; i++) {
            A[i]=true;
        }

        for (int i = 2; i <= Math.sqrt(A.length-1) ; i++) {
            if(!A[i]){
                continue;
            }
            for (int j = i+i; j <=A.length-1 ;j= j+i) {
                A[j]=false;
            }

        }
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                break;
            }
            int count=0;

            for (int i = n+1; i <=2*n ; i++) {
                if(A[i]){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
