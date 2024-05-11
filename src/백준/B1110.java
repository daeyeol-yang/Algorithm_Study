package 백준;

import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        String solution = "";
        if (s.length() == 1) {
            solution = "0".concat(s);
        } else {
            solution = s;
        }
        int answer =0;
        String solution2 = solution;

        while (true){
            answer++;
            solution2=cycle(solution2);
            if(solution2.length()==1){
                solution2="0".concat(solution2);
            }
            if(solution.equals(solution2)){
                break;
            }


        }
        System.out.println(answer);



    }

    public static String cycle(String s){
        int n1 = Integer.parseInt(s)%10;
        int n2 = Integer.parseInt(s)/10;
        int n3 = (n1+n2)%10;
        int solution1  = n1*10+n3;

        return String.valueOf(solution1);
    }
}
