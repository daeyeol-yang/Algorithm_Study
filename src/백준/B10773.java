package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                stack.pop();
            }else {
                stack.push(n);
            }

        }

        int result=0;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            result+=(int) stack.peek();
            stack.pop();

        }
        System.out.println(result);
    }
}
