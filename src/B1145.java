import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int solution = 0;
        int check =0;
        while (true){
            solution++;

            for (int i = 0; i < arr.length; i++) {
                if(solution%arr[i]==0){
                    check++;
                }
            }

            if(check>=3){
                break;
            }else{
                check=0;
            }

        }
        System.out.println(solution);

    }
}
