package 백준;

import java.util.Scanner;

public class B10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        boolean b =true;
        char []ch = s.toCharArray();
        for (int i = 0; i < ch.length/2; i++) {
            if(ch[i]!=ch[ch.length-1-i]){
                b=false;
            }
        }
        if(b==false){
            System.out.println(0);
        }else {
            System.out.println(1);
        }

    }
}
