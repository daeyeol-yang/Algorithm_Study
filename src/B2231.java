import java.util.Scanner;

public class B2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check =false;


        for (int i = 1; i <= n; i++) {
            int add=i;
            int solution=i;
            while (solution!=0){
               add+=solution%10;
               solution/=10;
            }
            if(n==add){
                System.out.println(i);
                check=true;
                break;
            }
        }
        if (!check){
            System.out.println(0);
        }
    }
}
