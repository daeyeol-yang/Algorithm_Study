package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new LinkedList<>();

        //LinkedList<Integer> deque3 = new LinkedList<>();
        //앞으로 덱 문제는 LinkedList를 이용해서 풀기 특히 indexOf 구하는 문제!!

        for (int i = 1; i <= N ; i++) {
            deque.add(i);
        }

        int answer =0;
        for (int i = 0; i < M; i++) {
            int target = arr[i];
            if(deque.peek()==target){
                deque.pollFirst();
            }else{
                int count1= s1(deque,target);
                int count2 = s2(deque,target);

               if(count1<=count2){
                   for (int j = 0; j < count1; j++) {
                       deque.addLast(deque.pollFirst());
                   }
                   answer+=count1;
               }else{
                   for (int j = 0; j < count2; j++) {
                       deque.addFirst(deque.pollLast());
                   }
                   answer+=count2;
               }
               deque.pollFirst();
            }

        }


        System.out.println(answer);

    }

    public static int s1(Deque<Integer> deque, int target){
        Deque<Integer> deque1 = new LinkedList<>();
        for (int i = 0; i < deque.size(); i++) {
            int num = deque.pollFirst();
            deque1.add(num);
            deque.add(num);
        }
        int count =0;
        while (true){
            int n=deque1.peekFirst();
            if(n==target){
                break;
            }else{
                deque1.addLast(deque1.pollFirst());
                count++;
            }

        }
        return count;

    }

    public static int s2(Deque<Integer> deque, int target){
        Deque<Integer> deque2 = new LinkedList<>();
        for (int i = 0; i < deque.size(); i++) {
            int num = deque.pollFirst();
            deque2.add(num);
            deque.add(num);
        }
        int count =0;
        while(true){
            int n = deque2.peekFirst();
            if(n==target){
                break;
            }else{
                deque2.addFirst(deque2.pollLast());

                count++;

            }
        }
        return count;
    }
}
