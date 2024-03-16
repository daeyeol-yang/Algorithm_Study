import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [][] arr = new int[T][2];
        for (int i = 0; i < T ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr,((o1, o2) -> {
            return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
        }));

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
