
import java.util.*;
import java.io.*;

public class Permutations {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        if (n == 1) System.out.println(1);
        else if (n<=3) System.out.println("NO SOLUTION");
        else {
            for (int i = 1; i <= n; i++) {
                if (i%2==0) {
                    left.append(i+" ");
                } else {
                    right.append(i+" ");
                }
            }
            System.out.print(left.toString());
            System.out.println(right.toString());
        }
    }// 1 2 3 4 5 6 7
    //  2 4 6 1 3 5 7

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
