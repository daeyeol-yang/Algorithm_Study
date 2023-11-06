import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt( br.readLine());
        int M =Integer.parseInt( br.readLine());
        int []array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        int start =0;
        int last = N-1;
        int count =0;

        while (start < last){
            if(array[start]+array[last]<M){
                start++;
            } else if (array[start]+array[last]>M) {
                last--;

            }else{
                count++;
                start++;
                last--;
            }
        }
        System.out.println(count);
        br.close();

    }
}
