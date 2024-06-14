package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        HashMap<String , Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String s1 = s.substring(s.lastIndexOf('.')+1);
            set.add(s1);
            if(hashMap.containsKey(s1)){
                hashMap.put(s1,hashMap.get(s1)+1);
            }else{
                hashMap.put(s1,1);
            }
        }
        List<String> myList = new ArrayList<>();
        for(String s2: set){
            myList.add(s2);
        }

        Collections.sort(myList);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myList.size(); i++) {
           sb.append(myList.get(i)).append(" ").append(hashMap.get(myList.get(i))).append('\n');
        }

        System.out.println(sb);
    }
}
