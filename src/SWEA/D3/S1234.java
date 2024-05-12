package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class S1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 1;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int testCase = 1; testCase <= T; testCase++) {
            sb.append("#").append(testCase).append(" ");
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            StringBuilder sb1 = new StringBuilder();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {

                int number = s.charAt(i)-'0';

                if(!stack.isEmpty()&&stack.peek()==number){
                    stack.add(number);
                    stack.pop();
                    stack.pop();
                }else {

                    stack.add(number);
                }

            }
            while (!stack.isEmpty()){
                sb1.append(stack.pop());
            }
            sb.append(sb1.reverse()).append('\n');

        }
        System.out.println(sb);
    }


}
