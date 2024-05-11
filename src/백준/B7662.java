package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> queue = new PriorityQueue();
            PriorityQueue<Integer> queueReverse = new PriorityQueue(Collections.reverseOrder());
            Map<Integer, Integer> map = new HashMap();
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String s = st.nextToken();

                int a = Integer.parseInt(st.nextToken());

                if (s.equals("I")) {
                    queue.add(a);
                    queueReverse.add(a);
                    if (map.containsKey(a)) {
                        map.put(a, map.get(a) + 1);
                    } else {
                        map.put(a, 1);
                    }

                } else {
                    if (!map.isEmpty()) {
                        int q = queueReverse.peek();
                        int p = queue.peek();
                        if (a > 0 && map.containsKey(q)) {
                            if (map.get(q) > 0) {
                                map.put(q, map.get(q) - 1);
                                if (map.get(q) == 0) {
                                    map.remove(q);
                                }
                                queue.remove(q);
                                queueReverse.poll();
                            }

                        } else if (a < 0 && map.containsKey(p)) {

                            if (map.get(p) > 0) {

                                map.put(p, map.get(p) - 1);

                                if (map.get(p) == 0) {
                                    map.remove(p);
                                }
                                queueReverse.remove(p);
                                queue.poll();
                            }
                        }
                    }
                }
            }
            int max = 0;
            int min = 0;
            if (map.isEmpty()) {
                sb.append("EMPTY").append('\n');
            } else {
                while (!queue.isEmpty()) {
                    if (map.containsKey(queue.peek())) {
                        min = queue.peek();
                        break;
                    }
                    queue.poll();
                }
                while (!queueReverse.isEmpty()) {
                    if (map.containsKey(queueReverse.peek())) {
                        max = queueReverse.peek();
                        break;
                    }
                    queueReverse.poll();
                }

                sb.append(max).append(" ").append(min);
            }


        }
        System.out.println(sb);
    }
}
