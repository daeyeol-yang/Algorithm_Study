package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class B7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<String> set = new HashSet();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String enter = st.nextToken();

            if(enter.equals("enter")){
                set.add(name);
            }else {
                set.remove(name);
            }

        }

        List<String> mylist = new ArrayList<>();

        for(String s : set){
            mylist.add(s);
        }
        Collections.sort(mylist, Collections.reverseOrder());

        for(String s : mylist){
            System.out.println(s);
        }
    }
}
