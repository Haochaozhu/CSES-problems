
import java.math.BigInteger;
import java.text.Collator;
import java.util.*;
import java.io.*;

public class MissingNumber {


    public static void main(String[] args) {
        FastReader sc = new FastReader();
        long n = sc.nextInt();
        long sum = (1+n)*n/2;
        for (int i = 0; i < n-1; i++) {
            sum-=sc.nextInt();
        }
        System.out.println(sum);
    }

    private static boolean preSum(int[] nums, int target) {
        int cur = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            if (set.contains(cur-target)) {
                System.out.println(cur-target);
                return true;
            }
            set.add(cur);
        }
        return false;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}
