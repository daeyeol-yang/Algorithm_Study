package 백준;

import java.util.Scanner;

public class B1316 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        boolean result =true;
        int resultCount=0;
        for (int test_case=1;test_case<=T;test_case++){
            result=true;
            String s= sc.next();
            char []ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                for (int j = i+1; j <ch.length ; j++) {
                    if(ch[i]==ch[j]){
                        if((j-i)>1){
                            result=false;

                        }break;
                    }
                }
            }
            if(result){
                resultCount++;
            }
        }
        System.out.println(resultCount);
    }
}
// boolean 값 for 구문 돌때마다 초기화 잊지 않기!!