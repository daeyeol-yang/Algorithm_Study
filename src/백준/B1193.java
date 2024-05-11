package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class B1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int 몇번째 = Integer.parseInt(br.readLine());



        int 대각선갯수 =1;

        int 전까지의대각선총갯수 =0;
        int first =0;
        int second=0;


        while (true){

            if(전까지의대각선총갯수+대각선갯수>=몇번째){
                if(대각선갯수%2==0){
                  first =  몇번째 - 전까지의대각선총갯수;
                  second = 대각선갯수+1 - first;
                    System.out.println(first + "/" + second);
                    break;
                }else {

                    second = 몇번째 - 전까지의대각선총갯수;
                    first = 대각선갯수+1 - second;

                    System.out.println(first + "/" + second);
                    break;
                }

            }else {
                전까지의대각선총갯수+=대각선갯수;
                대각선갯수++;
            }





        }



    }
}
