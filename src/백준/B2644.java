package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2644 {

    static ArrayList<Integer> myList[];

    static boolean[] visit;

    static int solution = 0;

    static int first;

    static int second;

    static boolean check;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        myList = new ArrayList[N + 1];
        visit = new boolean[N+1];
        for (int i = 0; i < N + 1; i++) {
            myList[i] = new ArrayList<>();
        }
        first = Integer.parseInt(st.nextToken());
        second = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int listfirst = Integer.parseInt(st.nextToken());
            int listsecond = Integer.parseInt(st.nextToken());
            myList[listfirst].add(listsecond);
            myList[listsecond].add(listfirst);

        }

        dfs(first,0);
        if (!check) {
            System.out.println(-1);
        } else {
            System.out.println(solution);
        }


    }

    static void dfs(int index,int count) {

        visit[index] = true;
        if (index == second) {
            check = true;
            solution=count;
            return;
        }
        for (int i : myList[index]) {
            if (!visit[i]) {
                dfs(i,count+1);


            }
        }

    }
}
