package 백준;

import java.util.Scanner;

public class B2023 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    private static void DFS(int i, int jarisu) {
        if(jarisu==N){
            if(isPrime(i)){
                System.out.println(i);
            }
            return;
        }
        for (int j = 0; j < 10; j++) {
            if(isPrime(i*10+j)){
                DFS(i*10+j,jarisu+1);
            }
        }


    }

    private static boolean isPrime(int i) {
        for (int j = 2; j*j <=i ; j++) {
            if(i%j==0){
                return false;
            }
        }return true;
    }
}
