import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[26];
        String s = sc.next();
        String s1 = s.toUpperCase();
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            array[ch[i] - 'A']++;
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        int count = 0;
        char result = ' ';

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                count++;
                result = (char) (i + 'A');
            }
        }

        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(result);
        }

    }
}



/*for (int i = 0; i < 26; i++) {
        if (arr[i] > max) {
        max = arr[i];
        ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
        }
        else if (arr[i] == max) {
        ch = '?';
        }*/
//max가 arr[i]인 경우를 바로 ?로 출력