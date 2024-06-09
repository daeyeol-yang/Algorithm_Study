package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2578 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[5][5];
        boolean[][] check = new boolean[5][5];

        int[] arr1 = new int[25];

        //빙고판 입력
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j]= Integer.parseInt(st.nextToken());
            }

        }

        //사회자 숫자 입력
        for (int i = 0; i < 5; i++) {
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr1[5*i+j]=Integer.parseInt(st.nextToken());
            }

        }



        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(arr[j][k]==arr1[i]){
                        check[j][k]=true;
                            if (countBingo(check) >= 3) {
                                System.out.println(i+1);
                                System.exit(0);

                            }
                    }
                }
            }
        }


    }

    public static int countBingo(boolean[][] check){
        int count =0;

        for (int i = 0; i < 5; i++) {
            if(isBingoRow(check[i])) count++;
        }

        for (int i = 0; i < 5; i++) {
            if(isBingoColumn(check,i)) count++;
        }

        if(isBingoM(check)) count++;
        if(isBingoR(check)) count++;

        return count;
    }

    private static boolean isBingoRow(boolean[] row){
        for ( boolean cell : row ){
            if(!cell) return false;
        }
        return true;
    }

    private static boolean isBingoColumn(boolean[][] check , int cnt){
        for (int i = 0; i < 5; i++) {
            if(!check[i][cnt]) return false;
        }
        return true;
    }

    private static boolean isBingoM(boolean[][] check){
        for (int i = 0; i < 5; i++) {
            if(!check[i][i]) return false;
        }
        return true;
    }

    private static boolean isBingoR(boolean[][] check){
        for (int i = 0; i < 5; i++) {
            if(!check[i][4-i]) return false;
        }
        return true;
    }

//    public static int isCheck(boolean[][] arr){
//        int countSum=0;
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            count=0;
//            for (int j = 0; j < arr.length; j++) {
//                if(!arr[i][j]){
//                    break;
//                }else{
//                    count++;
//                }
//            }
//            if(count==5){
//                countSum++;
//            }
//        }
//        //System.out.println("1 "+ countSum);
//
//        for (int i = 0; i < arr.length; i++) {
//            count=0;
//            for (int j = 0; j < arr.length; j++) {
//                if(!arr[j][i]){
//                    break;
//                }else{
//                    count++;
//                }
//            }
//            if(count==5){
//                countSum++;
//            }
//        }
//        //System.out.println("2 "+ countSum);
//
//        count=0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if(i==j){
//                    if(!arr[i][j]){
//                        break;
//                    }else {
//                        count++;
//                    }
//                }
//            }
//        }
//        if(count==5){
//            countSum++;
//
//        }
//        //System.out.println("3 "+ countSum);
//
//        count=0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if(i+j== arr.length-1){
//                    if(arr[i][j]) {
//                        count++;
//                    }
//                }
//            }
//        }
//        if(count==5){
//            countSum++;
//        }
//        //System.out.println("4 "+ countSum);
//        //System.out.println("합:"+countSum);
////        for (int i = 0; i < 5; i++) {
////            System.out.println(Arrays.toString(arr[i]));
////        }
//
//        return countSum;
//    }
}
