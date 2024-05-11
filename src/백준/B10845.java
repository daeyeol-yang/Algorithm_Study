package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Queue myqueue = new LinkedList();
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());


            switch (st.nextToken()){
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    myqueue.offer(n);
                    break;

                case "pop":
                    if(myqueue.isEmpty()){
                        System.out.println(-1);
                    }else{

                        System.out.println(myqueue.poll());
                    }
                    break;


                case "size":
                    System.out.println(myqueue.size());
                    break;
                case "empty":
                    if(myqueue.isEmpty()){
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(myqueue.isEmpty()){
                        System.out.println(-1);

                    }else {
                        System.out.println(myqueue.peek());
                    }
                    break;
                case "back":
                    if (myqueue.isEmpty()) {
                        System.out.println(-1);

                    } else {
                        for (int j = 0; j < myqueue.size()-1; j++) {
                            myqueue.offer(myqueue.poll());
                        }
                        System.out.println(myqueue.peek());
                        myqueue.offer(myqueue.poll());
                    }
                    break;
            }
        }
    }
}
