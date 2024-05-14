package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S1216 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <=10 ; testcase++) {
            int T = Integer.parseInt(br.readLine());


            sb.append("#").append(T).append(" ");

            char[][] arr = new char[100][100];

            for (int i = 0; i < 100; i++) {
                String s = br.readLine();
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }

            boolean check1 =false;
            boolean check2=false;

            for (int len = 100; len >= 1; len--) {
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 100-(len-1); j++) {
                        char []problem = new char[len];
                        char []problem1 = new char[len];
                        for (int k = 0; k < len; k++) {
                            problem[k]= arr[i][j+k];
                            problem1[k]= arr[j+k][i];

                        }
                        if( isCheck(new String(problem))|| isCheck(new String(problem1))){
                            sb.append(len);
                            check1=true;
                            check2=true;
                            break;
                        }

                    }
                    if(check1){
                        break;
                    }

                }
                if(check2){
                    break;
                }
            }

            sb.append('\n');
        }

        System.out.println(sb);



    }



//    static boolean isRCheck(int len ,char[][]arr){
//
//        for (int i = 0; i < 100; i++) {
//
//            for (int j = 0; j < 100-(len-1); j++) {
//                char []problem = new char[len];
//                for (int k = 0; k < (len); k++) {
//                    problem[k]=arr[i][j+k];
//                }
//                if(isCheck(new String(problem))){
//                    return true;
//                }
//            }
//
//        }
//        return false;
//
//    }
//
//    static boolean isCCheck(int len, char[][]arr){
//        for (int i = 0; i < 100; i++) {
//            for (int j = 0; j < 100-(len-1) ; j++) {
//                char []problem = new char[len];
//                for (int k = 0; k < len; k++) {
//                    problem[k]=arr[j+k][i];
//                }
//                if(isCheck(new String(problem))){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    static boolean isCheck(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
