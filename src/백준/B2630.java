package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2630 {

    static int[][] arr;

    static int countB;

    static int countW;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        solution(0,0,N);

        StringBuilder sb = new StringBuilder();
        sb.append(countW).append('\n').append(countB);

        System.out.println(sb);
    }

    static void solution(int row, int col, int size){
        if(checkSquare(row, col, size)){
            if(arr[row][col]==1){
                countB++;
            }else {
                countW++;
            }
            return;
        }
        int new_size = size/2;

        solution(row, col, new_size);
        solution(row+new_size,col,new_size);
        solution(row, col+new_size, new_size);
        solution(row+new_size,col+new_size,new_size);




    }

    static boolean checkSquare(int row, int col, int size){
        int n = arr[row][col];
        for (int i = row; i <row+ size; i++) {
            for (int j = col; j <col+ size; j++) {
                if(arr[i][j]!=n){
                    return false;
                }
            }
        }
        return true;
    }
}
