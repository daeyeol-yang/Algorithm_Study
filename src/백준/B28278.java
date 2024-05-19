package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class B28278 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int K = sc.nextInt();
            switch (K){
                case 1:
                    int m =sc.nextInt();
                    stack.add(m);
                    break;
                case 2:
                    if(stack.isEmpty()){
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(stack.pop()).append('\n');
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    if(stack.isEmpty()){
                        sb.append(1).append('\n');
                    }else {
                        sb.append(0).append('\n');
                    }
                    break;

                case 5:
                    if(stack.isEmpty()){
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
