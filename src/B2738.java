import java.util.Scanner;

public class B2738 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int [][] array1 =new int[num1][num2];
        int [][] array2= new int[num1][num2];
        int [][] result = new int [num1][num2];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j <num2; j++) {
                array1[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j <num2; j++) {
                array2[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j <num2; j++) {
                result[i][j]=array1[i][j]+array2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


    }
}
