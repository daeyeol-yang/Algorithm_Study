package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 3;
        int number=0;
        int number1=0;
        for (int i = 0; i < N; i++) {
            String s= br.readLine();
            if(Character.isDigit(s.charAt(0))){
                number=i;
                number1=Integer.parseInt(s);

            }
        }
        int solution=number1+N-number;



        if(solution%5==0&&solution%3==0){
            System.out.println("FizzBuzz");
        } else if (solution%5==0&&solution%3!=0) {
            System.out.println("Buzz");
        } else if (solution%5!=0&&solution%3==0) {
            System.out.println("Fizz");
        }else {
            System.out.println(solution);
        }

    }
}
