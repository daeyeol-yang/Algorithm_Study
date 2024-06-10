package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4396 {

    private static char[][] board;
    private static boolean[][] check;
    private static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        board = new char[N+2][N+2];
        check = new boolean[N+2][N+2];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }

        String s;
        for (int i = 1; i <board.length-1 ; i++) {
            s = br.readLine();
            for (int j = 1; j <board.length-1 ; j++) {
                board[i][j]= s.charAt(j-1);
            }
        }

        for (int i = 1; i <check.length-1 ; i++) {
            s = br.readLine();
            for (int j = 1; j < check.length-1; j++) {
                if(s.charAt(j-1)=='x'){
                    check[i][j]=true;
                }
            }
        }

        boolean isLose =false;

        for (int i = 1; i <check.length-1 ; i++) {
            for (int j = 1; j <check.length-1 ; j++) {
                if(check[i][j]){
                    if(board[i][j]=='*'){
                        isLose=true;
                    }
                }
            }
        }

        if(isLose){
            lose();
        }else{
            win();
        }

        System.out.println(sb);


//        for (int i = 0; i < board.length; i++) {
//            System.out.println(Arrays.toString(board[i]));
//           // System.out.println(Arrays.toString(check[i]));
//        }
    }

    private static int isCheck(int x, int y){
        int count=0;
        for (int i = -1; i <=1 ; i++) {
            for (int j = -1; j <=1 ; j++) {
                if(i==0&&j==0){
                    continue;
                }

                if(board[x+i][y+j]=='*'){
                    count++;
                }
            }
        }
        return count;
    }

    private static void lose(){
        for (int i = 1; i <board.length-1 ; i++) {
            for (int j = 1; j <board.length-1 ; j++) {


                    if (board[i][j] != '*') {
                        if(check[i][j]){

                            sb.append(isCheck(i, j));
                        }else {
                            sb.append('.');
                        }

                    } else {
                        sb.append('*');
                    }

            }
            sb.append('\n');
        }
    }

    private static void win(){
        for (int i = 1; i < board.length-1 ; i++) {
            for (int j = 1; j < board.length-1; j++) {
                if(check[i][j]){
                    if(board[i][j]=='*'){
                        sb.append('.');
                    }else {
                        sb.append(isCheck(i,j));
                    }
                }else{
                    sb.append('.');

                }
            }
            sb.append('\n');

        }
    }
}
