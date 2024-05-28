package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr1 = new int[N];
        st = new StringTokenizer(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= Integer.parseInt(st.nextToken());
            if(arr[i]==0){

                deque.add(arr1[i]);
            }
        }

        int N1 = Integer.parseInt(br.readLine());

        int[]arr2 = new int[N1];

        st= new StringTokenizer(br.readLine());

        for (int i = 0; i < N1; i++) {
            arr2[i]= Integer.parseInt(st.nextToken());

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N1; i++) {
            deque.addFirst(arr2[i]);
            sb.append(deque.pollLast()+" ");
        }

//        for (int i = 0; i < N1; i++) {
//            int start = arr2[i];
//            for (int j = 0; j < N; j++) {
//                if(arr[j]==0){
//                    int temp =0;
//                    temp=arr1[j];
//                    arr1[j]=start;
//                    start=temp;
//                }
//            }
//            sb.append(start).append(" ");
//
//        }
        System.out.println(sb);
    }

}
