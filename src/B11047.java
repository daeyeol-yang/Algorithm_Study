import java.util.Scanner;

public class B11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = sc.nextInt();
        int [] money = new int[N];
        for (int i = 0; i < N; i++) {
            money[i]=sc.nextInt();
        }
        int count =0;
        for (int i = N-1; i >=0 ; i--) {
            if(money[i]<=total) {
                count+=total/money[i];
                total %= money[i];
            }

        }
        System.out.println(count);
    }
}
