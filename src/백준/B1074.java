package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1074 {
    static int count =0;

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2,N);


        method(r,c,size);

        System.out.println(count);


    }

    static void method(int row, int col, int size){
        if(size==1){
            return;
        }

        int new_size = size/2;

        if(row<new_size&& col<new_size){
            method(row,col,new_size);
        } else if (row<new_size && col>=new_size) {
            count+=new_size*new_size;
            method(row, col-new_size, new_size);
        } else if( row>=new_size && col<new_size){
            count+= new_size*new_size*2;
            method(row-new_size, col, new_size);
        } else {
            count+= new_size*new_size*3;
            method(row-new_size,col-new_size,new_size);
        }


    }
}
