package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        int sum=0;
        for (int i = n1; i <=n2 ; i++) {
            if(is_Prime(i)){
                list.add(i);
                sum+=i;
            }
        }
        if(list.isEmpty()){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            Collections.sort(list);
            System.out.println(list.get(0));
        }


    }

    static boolean is_Prime(int n){
        if(n==1){
            return false;
        }else if(n==2){
            return true;
        } else if(n%2==0){
            return false;
        }else {
            for (int i = 3; i*i <=n ; i++) {
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
