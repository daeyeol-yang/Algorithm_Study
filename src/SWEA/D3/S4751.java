package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int testcase = 1; testcase <= T ; testcase++) {
            String s = br.readLine();
            StringBuilder sb1 = new StringBuilder("..#.");
            StringBuilder sb2 = new StringBuilder(".#.#");
            StringBuilder sbsol1= new StringBuilder();
            StringBuilder sbsol2= new StringBuilder();
            StringBuilder sbsol3= new StringBuilder();


            for (int i = 0; i < s.length(); i++) {
                sbsol1.append(sb1);
                sbsol2.append(sb2);
                sbsol3.append("#.").append(s.charAt(i)).append(".");

            }

            System.out.println(sbsol1.append("."));
            System.out.println(sbsol2.append("."));
            System.out.println(sbsol3.append("#"));
            System.out.println(sbsol2);
            System.out.println(sbsol1);




        }

    }
}
