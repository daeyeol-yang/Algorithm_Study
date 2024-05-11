package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack1 = new Stack();
        String s;
        boolean check=false;
        while (true){
            s= br.readLine();
            if(s.equals(".")){
                break;
            }
            check=false;
            for (int i = 0; i < s.length(); i++) {
                try {
                    char c = s.charAt(i);

                    if (c == '(') {
                        stack1.push(c);
                    } else if (c == ')') {
                        if(stack1.peek().equals('(')){
                            stack1.pop();
                        }else{
                            check=true;
                            break;
                        }
                    } else if (c == '[') {
                        stack1.push(c);

                    } else if (c == ']') {
                        if(stack1.peek().equals('[')){
                            stack1.pop();
                        }else {
                            check=true;
                            break;
                        }
                    }
                }catch (EmptyStackException e){
                    check=true;

                    break;
                }
                //System.out.println(stack1);
            }
            if(check){
                System.out.println("no");
                stack1.clear();

                continue;
            }
            if(stack1.isEmpty()){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            stack1.clear();


        }
    }
}
