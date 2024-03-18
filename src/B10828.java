import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            st= new StringTokenizer(br.readLine());
            String s =st.nextToken();
            switch (s){
                case "push":
                    stack.push(st.nextToken());
                    break;
                case "pop":
                    try {
                        System.out.println(stack.pop());

                    }catch (Exception e){
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.empty()){
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    try {
                        System.out.println(stack.peek());

                    }catch (Exception e){
                        System.out.println(-1);
                    }
                    break;




            }

        }
    }
}
