package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    deque.add(n);
                    break;

                case "front":
                    if(!deque.isEmpty()){
                        sb.append(deque.peekFirst()).append('\n');
                    }else {
                        sb.append(-1).append('\n');
                    }
                    break;

                case "back":
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast()).append('\n');
                    }else {
                        sb.append(-1).append('\n');
                    }
                    break;

                case "pop":
                    if(!deque.isEmpty()){
                        sb.append(deque.pollFirst()).append('\n');
                    }else {
                        sb.append(-1).append('\n');
                    }
                    break;

                case "empty":
                    if(!deque.isEmpty()){
                        sb.append(0).append('\n');
                    }else {
                        sb.append(1).append('\n');
                    }
                    break;

                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}
