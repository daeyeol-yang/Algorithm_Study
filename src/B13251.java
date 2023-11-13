import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [] color = new int [N];
        double probability[] = new double[N];
        int total=0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            color[i] = Integer.parseInt(st.nextToken());
            total+=color[i];
        }
        st= new StringTokenizer(br.readLine());
        int K =Integer.parseInt(st.nextToken());
        double ans =0.0;
        for (int i = 0; i < N; i++) {
            if(color[i]>=K){
                probability[i]=1.0;
                for (int j = 0; j < K; j++) {
                    probability[i] *= (double)(color[i]-j)/(total-j);
                }
                ans+= probability[i];

            }

        }
        System.out.println(ans);


    }
}
