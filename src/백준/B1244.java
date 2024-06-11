package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1244 {

    private static boolean[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  =Integer.parseInt(br.readLine());
        arr = new boolean[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            if(Integer.parseInt(st.nextToken())==1){
                arr[i]=true;
            }
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if(gender==1){
                man(number);
            }else {
                woman(number);
            }
        }

        print();
    }
    private static void man(int number){

        for (int i = 1; i <arr.length ; i++) {
            if(i%number==0){
                arr[i]=!arr[i];
            }
        }

    }

    private static void woman(int number){
        arr[number]=!arr[number];
        for (int i = 1; number - i > 0 && number + i < arr.length ; i++) {
            if(arr[number+i]==arr[number-i]) {
                arr[number + i] = !arr[number + i];
                arr[number - i] = !arr[number - i];
            }else {
                break;
            }
        }

    }

    private static void print(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]){
                sb.append(1).append(" ");
            }else {

                sb.append(0).append(" ");
            }
            if(i%20==0){
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}
