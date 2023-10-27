import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25206 {
    public static void main(String[] args) throws IOException {
        String []s={"A+","A0","B+","B0","C+","C0","D+","D0","F"};
        double sum=0;
        double result=0;
        double average;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {

            String[] problem = br.readLine().split(" ");
            System.out.println(problem[2]);
            double score = Double.valueOf(problem[1]);
            average = 0;
            for (int j = 0; j < s.length; j++) {
                if (problem[2].equals("P")) {
                    result++;
                }
                if (problem[2].equals("F")) {
                    continue;
                }

                if (problem[2].equals(s[j])) {
                    average = 4.5 - j * (0.5);
                }
                sum += score * average;
            }


        }
        System.out.println(sum/(20-result));
    }
}
