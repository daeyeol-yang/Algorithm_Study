package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Character> mylist = new ArrayList<>();
        while (N>0){
            if(N%K>=10){
                mylist.add((char)(N%K-10+'A'));
            }else {
                mylist.add((char)(N%K+'0'));
            }

            N/=K;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mylist.size(); i++) {
            sb.append(mylist.get(i));
        }

        System.out.println(sb.reverse());

    }
}
