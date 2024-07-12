package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class B1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N ; i++) {
            String s = br.readLine();
            hashMap.put(s,hashMap.getOrDefault(s,0)+1);
        }

        List<String> keySet = new ArrayList<>(hashMap.keySet());

        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(hashMap.get(o1)==hashMap.get(o2)){
                    return o1.compareTo(o2);
                }
                return hashMap.get(o2).compareTo(hashMap.get(o1));

            }
        });

        System.out.println(keySet.get(0));
    }
}
