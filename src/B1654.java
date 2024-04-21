import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        int N =Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int []arr = new int[N];

        long max =0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max=Math.max(arr[i],max);
        }

        Arrays.sort(arr);
        List<Integer> myList = new ArrayList<>();

        for (int i = 1; i <= arr[arr.length-1]; i++) {
            int count =0;
            for (int j = 0; j < N; j++) {
                count+=arr[j]/i;
            }
            if(count==K){
                myList.add(i);
            }

        }

        Collections.sort(myList);

        System.out.println(myList.get(myList.size()-1));

//        max++;
//
//        long min =0;
//
//        long mid =0;
//
//
//        while (min<max){
//            mid=(max+min)/2;
//            long count =0;
//
//            for (int i = 0; i < arr.length; i++) {
//                count+=(arr[i]/mid);
//            }
//
//            if(count<K){
//                max=mid;
//            }else {
//                min = mid+1;
//            }
//
//        }
//
//        System.out.println(min-1);
        
        
        
    }
}
