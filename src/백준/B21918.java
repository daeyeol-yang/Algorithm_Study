package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B21918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st= new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            switch (x){
                case 1:
                    int k = Integer.parseInt(st.nextToken());
                    int x1 = Integer.parseInt(st.nextToken());

                    arr[k-1]=x1;
                    break;
                case 2:
                    int l = Integer.parseInt(st.nextToken());
                    int r = Integer.parseInt(st.nextToken());
                    for (int j = l-1; j <= r-1; j++) {
                        if(arr[j]==1){
                            arr[j]=0;
                        }else {
                            arr[j]=1;
                        }
                    }
                    break;
                case 3:
                    int l1 = Integer.parseInt(st.nextToken());
                    int r1 = Integer.parseInt(st.nextToken());
                    for (int j = l1-1; j <= r1-1; j++) {
                        arr[j]=0;
                    }
                    break;
                case 4:
                    int l2 = Integer.parseInt(st.nextToken());
                    int r2 = Integer.parseInt(st.nextToken());
                    for (int j = l2-1; j <= r2-1; j++) {
                        arr[j]=1;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
