package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14888 {

    static int N;

    static int Max = Integer.MIN_VALUE;
    static int Min = Integer.MAX_VALUE;

    static int [] number;

    static int [] op;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i]= Integer.parseInt(st.nextToken());
        }
         op = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < op.length; i++) {
            op[i]= Integer.parseInt(st.nextToken());
        }

        solution(number[0],1);
        System.out.println(Max);
        System.out.println(Min);
    }

    static void solution(int n,int depth){
        if(depth==N){
            System.out.println("마무리"+n);
            Max = Math.max(n,Max);
            Min = Math.min(n,Min);
            return;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("1 "+n);
            if(op[i]>0) {
                switch (i) {
                    case 0:

                        op[i]--;
                        solution(n+ number[depth],depth+1);
                        break;

                    case 1:

                        op[i]--;
                        solution(n- number[depth],depth+1);
                        break;

                    case 2:

                        op[i]--;
                        solution(n*number[depth],depth+1);
                        break;

                    case 3:

                        op[i]--;
                        solution(n/number[depth],depth+1);
                        break;

                }
                System.out.println("2 "+n);
                //solution(n,depth+1);

                op[i]++;
            }


        }


    }
}
