package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
//        ArrayList<Character> list = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            list.add(s.charAt(i));
//        }
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st;
//
//        int cursor = s.length();
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            char c = st.nextToken().charAt(0);
//            switch (c) {
//                case 'L':
//                    if (cursor > 0) {
//                        cursor--;
//                    }
//                    break;
//                case 'D':
//                    if (cursor < list.size()) {
//                        cursor++;
//                    }
//                    break;
//
//                case 'B':
//                    if(cursor > 0){
//                        list.remove(cursor-1);
//                        cursor--;
//                    }
//
//                    break;
//                case 'P':
//                    char c1 = st.nextToken().charAt(0);
//                    list.add(cursor, c1);
//                    cursor++;
//                    break;
//
//
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < list.size(); i++) {
//            sb.append(list.get(i));
//        }
//
//        System.out.println(sb);
        Stack<String> leftCursor = new Stack<>();
        Stack<String> rightCursor = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < s.length(); i++) {
            leftCursor.push(s.substring(i, i + 1));
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            switch (c) {
                case 'L':
                    if(!leftCursor.isEmpty()){
                        rightCursor.push(leftCursor.pop());
                    }
                    break;
                case 'D':
                    if(!rightCursor.isEmpty()){
                        leftCursor.push(rightCursor.pop());
                    }
                    break;

                case 'B':
                    if(!leftCursor.isEmpty()){
                        leftCursor.pop();
                    }
                    break;

                case 'P':
                    char c1 = st.nextToken().charAt(0);
                    leftCursor.push(String.valueOf(c1));
                    break;


            }
        }

        StringBuilder sb = new StringBuilder();
        while (!leftCursor.isEmpty()){
            sb.append(leftCursor.pop());
        }
        sb.reverse();
        while (!rightCursor.isEmpty()){
            sb.append(rightCursor.pop());
        }

        System.out.println(sb);


    }
}
