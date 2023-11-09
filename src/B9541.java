import java.util.Scanner;

public class B9541 {
    private static long[] P =new long[101];
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int test = sc.nextInt();
        P[1]=1;
        P[2]=1;
        P[3]=1;
        P[4]=2;
        P[5]=2;

        for (int i = 0; i < test; i++) {
            int problem = sc.nextInt();

            for(int j=6;j<=problem;j++){
                P[j]=P[j-1]+P[j-5];
            }
            System.out.println(P[problem]);

        }

    }
}
