package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= T; testcase++) {
            sb.append("#").append(testcase).append(" ");
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();

            for (int i = 0; i < s.length(); i++) {
                stack.add(s.charAt(i));
            }

            while (!stack.isEmpty()){
                char c = stack.pop();
                if(c=='b'){
                    sb.append('d');
                } else if (c=='d') {
                    sb.append('b');
                } else if (c=='p'){
                    sb.append('q');
                } else if (c=='q') {
                    sb.append('p');
                }

            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
