import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int solution = 1;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 =Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            if (n1==solution){
                solution=n2;
            }
            else if (n2==solution){
                solution=n1;
            }


        }
        System.out.println(solution);
    }
}
