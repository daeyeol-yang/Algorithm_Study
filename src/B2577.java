import java.util.Scanner;

public class B2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int [] arr = new int[10];

        int solution = n1*n2*n3;
        String s = String.valueOf(solution);
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <10 ; j++) {

                if(Integer.parseInt(String.valueOf(s.charAt(i)))==j){
                    arr[j]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
