import java.util.Scanner;

public class B11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dArray[] = new int[10001];
        dArray[1]=1;
        dArray[2]=2;
        for (int i = 3; i <=N ; i++) {
            dArray[i]=dArray[i-1]+dArray[i-2];
        }
    }
}
