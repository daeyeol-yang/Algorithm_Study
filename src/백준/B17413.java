package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            queue.add(c);

        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        boolean check = false;

        while (!queue.isEmpty()) {
            if (queue.peek() == '<') {

                while (queue.peek() != '>') {
                    sb.append(queue.poll());
                }
                sb.append(queue.poll());
            } else {
                while (queue.peek() != '<') {

                    if (queue.peek() == ' ') {
                        queue.poll();
                        check = true;
                        break;
                    }
                    sb1.append(queue.poll());

                    if (queue.isEmpty()) {
                        break;
                    }
                }

                sb.append(sb1.reverse());
                if (check) {
                    sb.append(" ");
                    check = false;
                }
                sb1 = new StringBuilder();

            }

        }
        System.out.println(sb);
    }
}
