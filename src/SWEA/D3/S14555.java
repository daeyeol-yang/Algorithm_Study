package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S14555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= T ; testcase++) {
            sb.append("#").append(testcase).append(" ");
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                stack.add(s.charAt(i));
            }
            int count=0;
            while (!stack.isEmpty()){
                char c = stack.pop();

                if(c==')'){
                    if(!stack.isEmpty()) {
                        char c1 = stack.peek();
                        if (c1 == '|' || c1 == '(') {
                            stack.pop();
                            count++;
                        }
                    }

                }else if(c=='|'){
                    if(!stack.isEmpty()) {
                        char c1 = stack.peek();
                        if (c1 == '(') {
                            stack.pop();
                            count++;
                        }
                    }
                }
            }
            sb.append(count).append('\n');

        }
        System.out.println(sb);
    }
}
