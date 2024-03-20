import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque myDeque = new ArrayDeque();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push_front":
                    int n = Integer.parseInt(st.nextToken());
                    myDeque.offerFirst(n);

                    break;
                case "push_back":
                    int n1 = Integer.parseInt(st.nextToken());
                    myDeque.offerLast(n1);
                    break;
                case "pop_front":
                    if(myDeque.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(myDeque.pollFirst());
                    }
                    break;
                case "pop_back":
                    if(myDeque.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(myDeque.pollLast());
                    }
                    break;
                case "size":
                    System.out.println(myDeque.size());
                    break;
                case "empty":
                    if(myDeque.isEmpty()){
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(myDeque.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(myDeque.peekFirst());
                    }
                    break;
                case "back":
                    if(myDeque.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(myDeque.peekLast());
                    }
                    break;
            }


        }
    }
}
