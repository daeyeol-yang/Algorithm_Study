import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1){
                break;
            }

            int sum =0;
            List<Integer> myList = new ArrayList<>();
            for (int i = 1; i < N; i++) {
                if(N%i==0){
                    myList.add(i);
                    sum+=i;
                }
            }
            StringBuilder sb = new StringBuilder();
            if(sum==N){
                sb.append(N).append(" = ").append(myList.get(0));
                for (int i = 1; i < myList.size(); i++) {
                    sb.append(" + " + myList.get(i));
                }
            }else{
                sb.append(N).append(" is NOT perfect.");

            }
            System.out.println(sb);
            myList.clear();

        }
    }
}
