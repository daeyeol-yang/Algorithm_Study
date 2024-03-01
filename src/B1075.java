import java.util.Scanner;

public class B1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int n3 = n1/100*100;

        while (true){
            if(n3%n2==0){
                break;
            }
            n3++;
        }
        String s = String.valueOf(n3);
        System.out.println(s.substring(s.length()-2));



    }
}
