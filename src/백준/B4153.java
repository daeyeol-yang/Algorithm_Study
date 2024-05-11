package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if(s.equals("0 0 0")){
                break;
            }
            int [] arr1 = new int[3];
            StringTokenizer st = new StringTokenizer(s);
            for (int i = 0; i < 3; i++) {
                arr1[i]= Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr1);
            if(arr1[2]*arr1[2]==arr1[0]*arr1[0]+arr1[1]*arr1[1]){
                System.out.println("right");
            }else{

                System.out.println("wrong");
            }
        }
    }
}
