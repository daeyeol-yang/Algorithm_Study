import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean check =true;

        Stack myStack = new Stack<>();
        for (int i = 0; i < T; i++) {
            String s = br.readLine();



                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '(') {
                        myStack.push(s.charAt(j));
                    } else if (s.charAt(j) == ')') {
                        if(myStack.isEmpty()){
                            check=false;
                            continue;
                        }
                        myStack.pop();
                    } else {
                        continue;
                    }
                }


            if(myStack.isEmpty()&&check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

            myStack.clear();
            check=true;


        }
    }
}
