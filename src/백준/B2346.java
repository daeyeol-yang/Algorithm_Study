package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());


        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            deque.add(new int[]{i+1,Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();



        while (!deque.isEmpty()){
            int[] start = deque.pollFirst();
            if(start==null)break;
            sb.append(start[0]).append(" ");
            if(start[1]>0){
                for (int i = 0; i < start[1]-1; i++) {
                    int [] temp = deque.pollFirst();
                    if(temp!=null){

                        deque.addLast(temp);
                    }
                }
            }else {
                for (int i = 0; i <Math.abs(start[1]); i++) {
                    int [] temp = deque.pollLast();
                    if(temp!=null){

                        deque.addFirst(temp);
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
