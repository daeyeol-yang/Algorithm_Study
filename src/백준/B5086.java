package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true){
            String s = br.readLine();
            if(s.equals("0 0")){
                break;
            }
            st = new StringTokenizer(s);
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(n2%n1==0){
                sb.append("factor").append('\n');
            }else if (n1%n2==0){
                sb.append("multiple").append('\n');
            }else {
                sb.append("neither").append('\n');
            }
        }

        System.out.println(sb);
    }
}
