import java.util.Scanner;

public class B1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int Array[] = new int[end+1];
        for (int i = 2; i <=end ; i++) {
            Array[i]=i;
        }
        for (int i = 2; i <=end ; i++) {
            if(Array[i]==0){
                continue;
            }
            for (int j = i+i; j <=end; j=j+i) {
                Array[j]=0;
            }
        }
        for (int i = start; i <=end ; i++) {
            if(Array[i]!=0){
                System.out.println(Array[i]);
            }
        }
    }
}
