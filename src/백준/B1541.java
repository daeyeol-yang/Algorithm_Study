package 백준;

import java.util.Scanner;

public class B1541 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String problem = sc.next();
        String []array  = problem.split("-");
        int answer=0;
        for (int i = 0; i < array.length; i++) {
            int temp = reSum(array[i]);
            if(i==0){
                answer+=temp;
            }else {
                answer-=temp;
            }
        }
        System.out.println(answer);


    }

    public static int reSum(String array){
        int result =0;
        String []s=array.split("\\+");
        for (int i = 0; i < s.length; i++) {
            result+=Integer.parseInt(s[i]);
        }
        return result;
    }
}
