package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int money1 = money;
        int money2 = money;

        int []day = new int[14];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 14; i++) {
            day[i] = Integer.parseInt(st.nextToken());

        }
        int count1 =0;
        int sum1 = 0;

        for (int i = 0; i < 14; i++) {
            if(money1>=day[i]){
                count1+=money1/day[i];
                money1%=day[i];
            }
        }
        sum1= count1*day[13]+money1;

        int count2=0;
        int sum2 =0;
        int countDown=0;
        int countUp=0;
        for (int i = 1; i < 14; i++) {


            if(day[i-1]>day[i]){
                countDown++;
                countUp=0;
            } else if (day[i-1]==day[i]) {
                countDown=0;
                countUp=0;
            }else {
                countDown=0;
                countUp++;
            }

            if(countDown>=3){
                if(money2>=day[i]){
                    count2+=money2/day[i];
                    money2%=day[i];
                }
            }

            if(countUp>=3&&count2!=0){
                money2=count2*day[i];
                count2=0;
            }
        }

        sum2= count2*day[13]+money2;

        if(sum1>sum2){
            System.out.println("BNP");
        } else if (sum1==sum2) {
            System.out.println("SAMESAME");
        }else {
            System.out.println("TIMING");
        }
    }
}
