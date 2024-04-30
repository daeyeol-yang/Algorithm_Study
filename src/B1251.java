import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B1251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> myList = new ArrayList<>();
        for (int i = 1; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length() ; j++) {
                String s1 = s.substring(0,i);

                String s2 = s.substring(i,j);
                String s3 = s.substring(j,s.length());

                myList.add(reverse(s1).concat(reverse(s2)).concat(reverse(s3)));

            }

        }
        Collections.sort(myList);

        System.out.println(myList.get(0));
    }

    public static String reverse(String s){
//        char [] arr = s.toCharArray();
//        char [] temp = new char[arr.length];
//        for (int i = 0; i <arr.length; i++) {
//            temp[arr.length-i-1]= arr[i];
//        }
        return new StringBuilder(s).reverse().toString();
    }
}
