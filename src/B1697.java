import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Time{
    int x;
    int count;

    public Time(int x, int count) {
        this.x = x;
        this.count = count;
    }
}
public class B1697 {
    static int[] map;

    static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int soobin = Integer.parseInt(st.nextToken());
        int dongsang = Integer.parseInt(st.nextToken());

        map = new int[200000];
        map[soobin]=-1;

        bfs(soobin);

        map[soobin]=0;
        System.out.println(map[dongsang]);


    }

    public static void bfs(int x){
        Queue<Time> queue = new LinkedList<>();

        Time start = new Time(x,0);

        queue.add(start);


        while (!queue.isEmpty()){
            Time now = queue.poll();
            int now_x = now.x;
            int now_count = now.count;


            int next = 2*now_x;
            if(next>=0&&next<map.length) {
                if (map[next] == 0) {
                    map[next] = now_count+1;
                    Time next1 = new Time(next,map[next]);
                    queue.add(next1);
                }
            }

            next= now_x +1;

            if(next>=0&&next<map.length){
                if(map[next]==0){
                    map[next] = now_count+1;
                    Time next1 = new Time(next,now_count+1);
                    queue.add(next1);
                }
            }
            next = now_x-1;
            if(next>=0&&next<map.length) {
                if (map[next] == 0) {
                    map[next] = now_count+1;
                    Time next1 = new Time(next, now_count+1);
                    queue.add(next1);
                }
            }




        }

    }
}
