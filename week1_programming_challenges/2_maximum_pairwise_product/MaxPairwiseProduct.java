import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        int max_value = 0;
        int val = -1;
        int val2 = -1;
        int second_max_value = 0;
        int n = numbers.length;

        for(int i=0;i<n;i++){
            if(val<numbers[i]){
                max_value = i;
                val = numbers[max_value];
            }
        }
        for(int i=0;i<n;i++){
            if(val2<numbers[i] && i != max_value){
                second_max_value = i;
                val2 = numbers[second_max_value];
            }
        }
        long res = Long.valueOf(numbers[max_value]) * Long.valueOf(numbers[second_max_value]);
        return res;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
