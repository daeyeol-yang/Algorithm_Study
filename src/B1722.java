import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long numberArray[] = new long[N+1];
        boolean visited[] = new boolean[N+1];
        int [] S =new  int[N+1];
        st = new StringTokenizer(br.readLine());
        int Q = Integer.parseInt(st.nextToken());
        numberArray[0]=1;
        for (int i = 1; i <= N; i++) {
            numberArray[i]=numberArray[i-1]*i;
        }
        if(Q==1){
            Long number = Long.parseLong(st.nextToken());
            for (int i = 1; i <=N ; i++) {
                int cnt =1;
                for (int j = 1; j <= N; j++) {
                    if(visited[j]){
                        continue;
                    }
                    if(number<=cnt*numberArray[N-i]){
                        number-=((cnt-1)*numberArray[N-i]);
                        S[i]=j;
                        visited[j]=true;
                        break;
                    }
                    cnt++;
                }

            }
            for (int i = 1; i <=N ; i++) {
                System.out.print(S[i]+" ");
            }
        }else{
            long k=1;
            for (int i = 1; i <=N ; i++) {
                S[i]=Integer.parseInt(st.nextToken());
                long cnt =0;
                for (int j = 1; j <S[i] ; j++) {
                    if(!visited[j]){
                        cnt++;
                    }
                }
                k+= cnt*numberArray[N-i];
                visited[S[i]]=true;

            }
            System.out.println(k);

        }
    }
}
