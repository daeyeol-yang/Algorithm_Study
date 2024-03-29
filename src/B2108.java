import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class B2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());
        int [] arr = new int[T];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        sb.append(mean(arr)).append('\n');
        sb.append(center(arr)).append('\n');
        sb.append(n(arr)).append('\n');
        sb.append(range(arr)).append('\n');
        System.out.println(sb);

    }

    public static int mean(int []arr){
        double sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return (int) Math.round(sum/arr.length);
    }

    public static int center(int []arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static int n(int []arr){
       boolean flag =false;
       int mode_max=0;
       int mode =0;
        for (int i = 0; i < arr.length; i++) {
            int jump =0;
            int count =1;
            int i_value = arr[i];

            for (int j = i+1; j <arr.length ; j++) {
                if(i_value != arr[j]){
                    break;
                }
                count++;
                jump++;
            }

            if(count > mode_max){
                mode_max =count;
                mode = i_value;
                flag =true;
            } else if (count == mode_max && flag ==true) {
                mode =i_value;
                flag =false;

            }
            i+=jump;
        }
        return mode;
    }

    public static int range(int []arr){
        return arr[arr.length-1]-arr[0];
    }
}
