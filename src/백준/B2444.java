package 백준;

import java.util.Scanner;

public class B2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N - 1; i++) {

            for (int j = i; j < N - 1; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
//            for (int j = i; j < N - 1; j++) {
//                System.out.print("-");
//            }
            System.out.println();
        }

        for (int i = 0; i < 2*N-1; i++) {
            System.out.print("*");

        }

        for (int i = N-1; i >0; i--) {
            System.out.println();
            for (int j = 0; j <N-i; j++) {
                System.out.print("-");
            }
            for (int j = 2*i-1; j >0; j--) {
                System.out.print("*");
            }
//            for (int j = 0; j <N-i; j++) {
//                System.out.print("-");
//            }
        }
        }
    }


