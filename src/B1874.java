import java.util.Scanner;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int []array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i]=sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num=1;
        boolean result=true;

        for (int i = 0; i <N; i++) {
            int list1=array[i];
            if(list1>=num){
                while(list1>=num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else{
                int n= stack.pop();
                if(n!=list1){
                    System.out.println("NO");
                    result=false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(sb.toString());
        }
    }
}
