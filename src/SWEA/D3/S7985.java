package SWEA.D3;

import java.util.Scanner;

public class S7985 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int testcase = 1; testcase <= T; testcase++) {
            sb.append("#").append(testcase).append(" ");
            int K = sc.nextInt();
            int N = (int) (Math.pow(2,K)-1);
            int []node = new int[N];

            for (int i = 0; i < N; i++) {
                node[i]= sc.nextInt();
            }

            int [] tree = new int[N+1];

            solve(0,N-1,1,0,tree,node);

            int i =1;
            int n = 0;
            for (int level = 0; level < K ; level++) {
                n+= (int)Math.pow(2,level);
                for (; i <= n; i++) {
                    sb.append(tree[i]).append(" ");
                }
                sb.append("\n");
            }

        }
        System.out.println(sb);
    }

    private static void solve(int left, int right, int treeIndex, int nodeIndex, int tree[], int node[]){
        int root = (left + right) / 2;
        tree[treeIndex] = node[root];

        if(left == right)
            return;
        solve(left, root-1, treeIndex*2, root, tree, node);
        solve(root+1, right, treeIndex*2+1, root, tree, node);
    }
}
