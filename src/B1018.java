import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
    public static boolean[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                if(s.charAt(j)=='W'){
                    arr[i][j]=false;
                }else {
                    arr[i][j]= true;
                }
            }

        }


        int count =0;
        int trueCount =0;
        int falseCount =0;
        boolean check=false;
        int result=64;

        for (int i = 0; i < N-7 ; i++) {
            for (int j = 0; j < M-7; j++) {
                trueCount=0;
                falseCount=0;

                check=false;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if(arr[i+k][j+l]!=check){
                            falseCount++;
                        }
                        check=!check;

                    }check=!check;
                }

                check=true;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if(arr[i+k][j+l]!=check){
                            trueCount++;
                        }
                        check=!check;

                    }check=!check;
                }
                count = Math.min(trueCount, falseCount);
                result = Math.min(count,result);
            }


        }
        System.out.println(result);


    }
}
