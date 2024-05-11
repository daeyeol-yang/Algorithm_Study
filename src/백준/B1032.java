package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= br.readLine();

        }
        String s = "";
        boolean check =false;

        for (int j = 0; j < arr[0].length(); j++) {
            check=false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i].charAt(j)!=arr[i+1].charAt(j)){
                    s=s.concat("?");
                    check = true;
                    break;
                }
            }
            if(!check) {
                s = s.concat(String.valueOf(arr[0].charAt(j)));
            }

        }

        System.out.println(s);
    }
}
