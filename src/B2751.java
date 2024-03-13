import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class B2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i = 0; i < T; i++) {
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);
    }
}
