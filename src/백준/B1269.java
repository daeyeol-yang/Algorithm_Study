package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int count =0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a1; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(n)){

                hashMap.replace(n,hashMap.get(n)+1);
                count--;
            }else{
                hashMap.put(n,0);
                count++;
            }
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a2; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(n)){

                hashMap.replace(n,hashMap.get(n)+1);
                count--;
            }else{
                hashMap.put(n,0);
                count++;
            }
        }

        System.out.println(count);





    }
}
