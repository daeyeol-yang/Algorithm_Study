public class B4673 {
    public static void main(String[] args) {
        int []array = new int[10001];

        for (int i = 1; i <=10000 ; i++) {
            String s = String.valueOf(i);
            int sum =i;

            for (int j = 0; j < s.length(); j++) {
                sum+=Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            if(sum<=10000){

                array[sum]++;
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=10000 ; i++) {
            if(array[i]==0){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }


}
