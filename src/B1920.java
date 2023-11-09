import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int []array = new int[N];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            
        }
        st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());


        Arrays.sort(array);
        boolean result;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < P; i++) {
            int target =Integer.parseInt( st.nextToken());
            result = false;
            int start =0;
            int end = array.length-1;
            while (start<=end){
                int midi = (start+end)/2;
                int midV = array[midi];
                if(midV>target){
                    end=midi-1;
                } else if (midV<target) {
                    start=midi+1;

                }else{
                    result=true;
                    break;
                }
            }

            if(result){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }
}
