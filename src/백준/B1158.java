package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1158 {

    public static Queue<Integer> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();
        for (int i = 1; i <=N ; i++) {
            queue.add(i);
        }
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            solution(K);
            list.add(queue.poll());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i <list.size() ; i++) {
            sb.append(list.get(i));
            if(list.size()-1!=i){

                sb.append(", ");
            }
        }

        sb.append(">");

        System.out.println(sb);
    }
    public static void solution(int n){
        for (int i = 0; i < n-1; i++) {
            queue.add(queue.poll());
        }
    }
}
