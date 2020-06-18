
import java.math.BigInteger;
import java.text.Collator;
import java.util.*;
import java.io.*;

public class IncreasingArray {


    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        long res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i]<arr[i-1]) {
                res += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(res);
    }

    private static boolean ok(Map<Character, Integer> map) {
        for(char c : map.keySet()) {
            if (map.get(c) != 1) return false;
        }
        return true;
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
