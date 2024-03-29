import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int solution =0;
        int solution1=0;
        if(N%5==0){
            solution = N/5 ;
        }else{
            int N1 = N%5;
            solution1=N/5;
            if(N1%3==0){
                solution=N1/3+solution1;
            }else {
                solution=-1;
            }

        }
        System.out.println(solution);



    }
}
