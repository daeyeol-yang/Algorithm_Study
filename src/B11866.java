import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k= sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 =new LinkedList<>();
        for (int i = 1; i <=N ; i++) {
            queue.add(i);

        }


        while (!queue.isEmpty()){
            for (int i = 0; i < k-1; i++) {
                queue.add(queue.poll());
            }
            queue1.add(queue.poll());
        }
        int count =0;
        int size = queue1.size();
        System.out.print("<");
        while(!queue1.isEmpty()){

            System.out.print(queue1.poll());
            if(count!=size-1) {
                System.out.print(", ");

            }
            count++;
        }
        System.out.println(">");
    }
}
