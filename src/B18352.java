import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class B18352 {
    static int visited[];
    static ArrayList<Integer>[] Array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();
        int number = sc.nextInt();
        int startCity = sc.nextInt();
        List<Integer> answer  = new ArrayList<>();
        Array = new ArrayList[node+1];

        for (int i = 1; i <=node; i++) {
            Array[i]=new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            Array[start].add(end);

        }

        visited = new int[node+1];
        for (int i = 0; i <=node ; i++) {
            visited[i]=-1;
        }
        BFS(startCity);
        for (int i = 0; i <=node ; i++) {
            if(visited[i]==number){
                answer.add(i);
            }
        }
        if(answer.isEmpty()){
            System.out.println("-1");
        }
        else{
            Collections.sort(answer);
            for(int temp: answer){
                System.out.println(temp);
            }
        }
    }
    public static void BFS(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node]++;
        while (!queue.isEmpty()){
            int now_node = queue.poll();
            for(int i:Array[now_node]){
                if(visited[i]==-1){
                    visited[i]=visited[now_node]+1;
                    queue.add(i);
                }
            }
        }
    }
}
