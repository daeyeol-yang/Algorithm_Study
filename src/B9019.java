import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B9019 {

    static String[] map;
    static boolean[] visited;
    static int start,end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            map = new String[100000];
            Arrays.fill(map,"");
            visited = new boolean[100000];
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            bfs(start);

            System.out.println(map[end]);


        }
    }

    static void bfs(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n]=true;
        while (!queue.isEmpty()){
            int now = queue.poll();
            int nextD = D(now);
            int nextS = S(now);
            int nextL = L(now);
            int nextR = R(now);
            if(!visited[nextD]){

                map[nextD]=map[now].concat("D");
                queue.add(nextD);
                visited[nextD]=true;
            }

            if(!visited[nextS]){

                map[nextS]=map[now].concat("S");
                queue.add(nextS);
                visited[nextS]=true;
            }

            if(!visited[nextL]){

                map[nextL]=map[now].concat("L");
                queue.add(nextL);
                visited[nextL]=true;
            }

            if(!visited[nextR]){

                map[nextR]=map[now].concat("R");
                queue.add(nextR);
                visited[nextR]=true;
            }

        }

    }

    static int D(int n){
        return 2*n>9999? 2*n%10000: 2*n;
    }

    static int S(int n){
        return n==0? 9999 : n-1;
    }

    static int L(int n){
//        StringBuilder sb = new StringBuilder(String.valueOf(n));
//        StringBuilder sb1 = new StringBuilder();
//        if(sb.length()<4){
//            for (int i = 0; i < 4-sb.length(); i++) {
//                sb1.append("0");
//            }
//        }
//        sb1.append(sb);
//
//        char[] arr = sb1.toString().toCharArray();
//        char[]arr1 = new char[4];
//        for (int i = 0; i < arr.length-1; i++) {
//            arr1[i]=arr[i+1];
//        }
//        arr1[arr1.length-1]=arr[0];
//
//
//
//        return Integer.parseInt(String.valueOf(arr1));
        return n%1000*10 + n/1000;
    }

    static int R(int n){
//        StringBuilder sb = new StringBuilder(String.valueOf(n));
//        StringBuilder sb1 = new StringBuilder();
//        if(sb.length()<4){
//            for (int i = 0; i < 4-sb.length(); i++) {
//                sb1.append("0");
//            }
//        }
//        sb1.append(sb);
//
//        char[] arr = sb1.toString().toCharArray();
//        char[]arr1 = new char[4];
//        for (int i = 0; i < arr.length-1; i++) {
//            arr1[i+1]=arr[i];
//        }
//        arr1[0]=arr[arr.length-1];
//
//
//
//
//        return Integer.parseInt(String.valueOf(arr1));
        return n%10*1000+n/10;
    }
}
