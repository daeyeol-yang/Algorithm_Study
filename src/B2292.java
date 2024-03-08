import java.util.Scanner;

public class B2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;

        int t =1;
        while (true){


            if(sum>=n){
                break;
            }

            sum+=6*t;
            t++;

        }

        System.out.println(t);
    }
}
