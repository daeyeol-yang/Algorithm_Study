import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {

            arr[i] = Integer.parseInt(br.readLine());

        }
        int check = (int) Math.round(T * 0.15);
        int sum = 0;
        Arrays.sort(arr);
        for (int j = check; j < T - check; j++) {
            sum += arr[j];
        }
        System.out.println(Math.round((double)sum/(T-2*check)));

    }
}
