import java.util.Scanner;

public class B2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] array = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9; j++) {
                array[i][j]=sc.nextInt();
            }
        }
        int max =0;
        int row =0;
        int column =0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9; j++) {
                if(max<array[i][j]){
                    max=array[i][j];
                    row =i+1;
                    column=j+1;
                }

            }
        }
        System.out.println(max);
        System.out.println(row+" "+ column);


    }
}
