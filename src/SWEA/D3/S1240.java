package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1240 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String [] arrS ={ "0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011",
                "0110111", "0001011" };
        for (int testcase = 1; testcase <=T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            st= new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            String solution="";

            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = M-1; j >=0; j--) {
                    if(s.charAt(j)=='1'){
                       solution = s.substring(j-55,j+1);
                       break;
                    }
                }
            }

            String [] arr1 = new String[8];
            int even=0;
            int odd=0;

            for (int i = 0; i < 8; i++) {
               arr1[i]= solution.substring(7*i,7*i+7);
                for (int j = 0; j < arrS.length; j++) {
                    if(arr1[i].equals(arrS[j])){
                        if(i%2==0){
                            odd+=j;
                        }else {
                            even+=j;
                        }
                    }
                }
            }

            int answer = (odd*3+even)%10==0 ? even+odd : 0;

            sb.append(answer).append('\n');





        }
        System.out.println(sb);
    }
}
