import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1392 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N_size = Integer.parseInt(st.nextToken());
        int Q_size = Integer.parseInt(st.nextToken());

        int []N = new int[N_size];
        int []Q = new int[Q_size];

        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < N_size; i++) {
            N[i]= Integer.parseInt(br.readLine());

        }

        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[i]; j++) {
                myList.add(i+1);
            }
        }


        for (int i = 0; i < Q_size; i++) {
            Q[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Q.length; i++) {
            sb.append(myList.get(Q[i])).append('\n');
        }
        System.out.println(sb);
    }
}
