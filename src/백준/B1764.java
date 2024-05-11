package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class B1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

//        List<String> mylist1 = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
//        String[] arr1 = new String[M];
//        String[] arr2 = new String[N];
        for (int i = 0; i < M; i++) {
            hashSet.add(br.readLine());
//            mylist1.add(br.readLine());
//            arr1[i] = br.readLine();
        }


        List<String> myList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
//            arr2[i] = br.readLine();
            String name = br.readLine();
            if(hashSet.contains(name)){
                myList.add(name);
            }

        }



//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//                if(arr1[i].equals(arr2[j])){
//                    myList.add(arr1[i]);
//                }
//            }
//        }
        Collections.sort(myList);

        StringBuilder sb = new StringBuilder();
        sb.append(myList.size()).append('\n');
        for (int i = 0; i < myList.size(); i++) {
            sb.append(myList.get(i)).append('\n');
        }

        System.out.println(sb);

    }
}
