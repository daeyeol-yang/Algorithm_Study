import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class B18870 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int []arr = new int[T];
        int []temp = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            temp[i] = arr[i];
        }



        Arrays.sort(temp);
        int rank =0;

        for (int i = 0; i < T; i++) {
            if(!hashMap.containsKey(temp[i])){

                hashMap.put(temp[i],rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
           sb.append(hashMap.get(arr[i])).append(" ");
        }
        System.out.println(sb);





    }
}
