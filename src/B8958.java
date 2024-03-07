import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            int sum=0;
            int check=0;
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
               if(String.valueOf(s.charAt(j)).equals("O")){
                   check++;
                   sum+=check;
               }else{
                   check=0;
               }
            }
            System.out.println(sum);
        }
    }
}
