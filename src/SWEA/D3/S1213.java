package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int testcase = Integer.parseInt(br.readLine());
            sb.append("#").append(testcase).append(" ");
            String answer = br.readLine();
            String problem = br.readLine();
            String problem1 = problem.replace(answer,"");

            int length = problem.length()-problem1.length();

            int count = length/answer.length();

            //int count = 0;
//            boolean check = false;
//
//            for (int j = 0; j < problem.length(); j++) {
//                if (problem.charAt(j) == answer.charAt(0)) {
//                    for (int k = 0; k < answer.length(); k++) {
//                        if (problem.charAt(j + k) != answer.charAt(k)) {
//                            check = true;
//
//                            break;
//                        }
//
//                    }
//                    if (!check) {
//                        count++;
//                    }
//                }
//                check = false;
//
//
//            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
