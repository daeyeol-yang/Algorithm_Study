package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1913 {

    private static int []dx = {0,1,0,-1};
    private static int []dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int [][] arr = new int[N][N];
        arr[0][0]=N*N;
        int index =0;
        int curX =0;
        int curY=0;

        while (true){
            if(arr[curY][curX]==1){
                break;
            }
            int nextX = curX+dx[index];
            int nextY = curY+dy[index];
            if(nextX>=0&&nextX<N&&nextY>=0&&nextY<N&&arr[nextY][nextX]==0){
                arr[nextY][nextX]=arr[curY][curX]-1;
                curX=nextX;
                curY=nextY;
            }else {
                index++;
            }
            if(index==4){
                index=0;
            }
        }
        int solutionX =0;
        int solutionY =0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j]==T){
                    solutionX=j+1;
                    solutionY=i+1;
                }
                sb.append(arr[i][j]).append(" ");

            }
            sb.append('\n');
        }
        sb.append(solutionY).append(" ").append(solutionX);

        System.out.println(sb);
    }
}
