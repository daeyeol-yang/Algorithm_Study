import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count =0;
        int [] Array = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            Array[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Array);
        for (int i = 0; i < N; i++) {
            int end = Array[i];
            int start =0;
            int last =N-1;

            while (start<last){
                if(Array[start]+Array[last]==end){
                    if(start!=i&&last!=i){
                        count++;
                        break;
                    } else if (start==i) {
                           start++;
                    }else if (last==i) {
                        last--;
                    }
                } else if (Array[start]+Array[last]<end) {
                    start++;

                }else {
                    last--;
                }
            }

        }
        System.out.println(count);
        bf.close();

    }
}
