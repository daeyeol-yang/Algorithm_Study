import java.util.Scanner;

public class B2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][]Array= new int[N+1][2];
        Array[1][1]=1;
        Array[1][0]=0;
        for (int i = 2; i <=N ; i++) {
            Array[i][0]=Array[i-1][0]+Array[i-1][1];
            Array[i][1]=Array[i-1][0];

        }
        System.out.println(Array[N][0]+Array[N][1]);
    }
}
