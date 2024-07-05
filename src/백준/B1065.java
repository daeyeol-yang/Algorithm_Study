package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count =0;
        for (int i = 1; i <=N ; i++) {
            if(isHansu(i)){
                count++;
            }

        }
        System.out.println(count);
    }

    public static boolean isHansu(int N){
        if(N<100){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while(N>0){
            list.add(N%10);
            N/=10;
        }
        int cha = list.get(0)-list.get(1);
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)-list.get(i+1)!=cha){
                return false;
            }
        }
        return true;


    }
}
