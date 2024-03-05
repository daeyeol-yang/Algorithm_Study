import java.util.Scanner;

public class B10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n1 = sc.nextInt();

            if(n1%h==0){
                System.out.println((h*100)+(n1/h));
            }else{
                System.out.println(((n1%h)*100)+((n1/h)+1));
            }
        }
    }
}
