package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }

        int [] arr1 = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            arr1[i]=arr[i+1]-arr[i];
        }
        int answer=0;
        for (int i = 0; i < arr1.length; i++) {
            answer= gcd(answer, arr1[i]);
        }
        //System.out.println(answer);

        int solution = (arr[N-1]-arr[0])/answer+1;

                //    17 14 11 8 5 2  18 15 12 9 6 3



        System.out.println(solution-N);
    }

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
