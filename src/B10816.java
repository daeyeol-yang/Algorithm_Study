import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            int key = Integer.parseInt(st.nextToken());
            map.put(key,map.getOrDefault(key,0)+1);
        }

        int T1 = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < T1; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(map.getOrDefault(key, 0)).append(" ");
        }
        System.out.println(sb);

//        int T = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int [] arr = new int[T];
//        for (int i = 0; i < T; i++) {
//            arr[i]= Integer.parseInt(st.nextToken());
//        }
//        int T1 = Integer.parseInt(br.readLine());
//        int [] arr1 = new int[T1];
//        int [] check = new int[T1];
//        StringTokenizer st1 = new StringTokenizer(br.readLine());
//        for (int i = 0; i < T1; i++) {
//            arr1[i]= Integer.parseInt(st1.nextToken());
//        }
//
//        for (int i = 0; i < T1; i++) {
//            for (int j = 0; j < T; j++) {
//                if(arr1[i]==arr[j]){
//                    check[i]++;
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < T1; i++) {
//            sb.append(check[i]+" ");
//        }
//        System.out.println(sb);
    }
}
