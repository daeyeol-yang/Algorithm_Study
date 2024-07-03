package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            stack.push(s.charAt(i));
//        }
//
//        int answer=0;
//        int stick =0;
//        while (stack.size()>1){
//            char c = stack.pop();
//
//            if(c==')'){
//                if(stack.peek()==')'){
//                    stick++;
//
//                }else{
//                    answer+=stick;
//                }
//            }else{
//                if(stack.peek()=='('){
//                    answer++;
//                    stick--;
//                }else{
//                    stick++;
//                }
//            }
//            System.out.println(answer);
//            System.out.println(stick);
        int answer=0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (s.charAt(i - 1) == '(') {

                    stack.pop();
                    answer+=stack.size();
                }


            }


        }
        System.out.println(answer);
    }
}
