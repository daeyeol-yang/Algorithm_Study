package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1076 {
    public static void main(String[] args) throws IOException {


        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int n1 = 0;
        int n2 =0;
        int n3 = 0;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i].equals(s1)){
                n1 = i;
            }
            if(arr[i].equals(s2)){
                n2 = i;
            }
            if(arr[i].equals(s3)){
                n3 = i;
            }

        }
        Long solution = (long) (Integer.parseInt(String.valueOf(n1).concat(String.valueOf(n2)))*Math.pow(10,n3));

        System.out.println(solution);
    }
    }
