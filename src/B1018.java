import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
    public static boolean[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if(s.charAt(j)=='W'){
                    arr[i][j]=true;
                }else {
                    arr[i][j]= false;
                }
            }
            
        }
        
        boolean check = arr[0][0];

        for (int i = 0; i < ; i++) {
            
        }


    }
}
