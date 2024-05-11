package 백준;

import java.util.Scanner;

public class B2941 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String [] s = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String problem = sc.next();
        for (int i = 0; i < s.length; i++) {
            if(problem.contains(s[i])){
                problem=problem.replace(s[i],"*");
            }
        }
        System.out.println(problem.length());
    }
}
