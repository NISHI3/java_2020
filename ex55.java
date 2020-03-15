import java.util.Arrays;
import java.util.Scanner;

/**
 * @File: ex55
 * @Description: N 個の整数 A1,A2,...,ANがあります。このうち 2つを選んでペアにする方法は N(N−1)2 通りありますが、それぞれのペアについて積を求め、小さい順に並べ替えたとき、K 番目にくる数は何になるでしょう？
 * @Input:
 * ------
 * N K
 * A1 ... An
 * ------
 */
public class ex55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long K = sc.nextLong();
        long[] A = new long[N];
        for (int i = 0; i< N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);;
        long l = -1000000000000000001L;
        long r = 1000000000000000001L;
        while (l + 1 < r) {
            long M = (l + r) / 2;
            if (check(M, K, A)) {
                l = M;
            } else {
                r = M;
            }
        }
        System.out.println(l);
    }
    public static boolean check(long n, long k, long[] a) {
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            int l = -1, r = a.length;
            if (a[i] < 0) {
                while (l + 1 < r) {
                    int m = (l + r) / 2;
                    if (a[m] * a[i] < n) {
                        r = m;
                    } else {
                        l = m;
                    }
                }
                count += (a.length - r);
            } else {
                while (l + 1 < r) {
                    int m = (l + r) / 2;
                    if (a[m] * a[i] < n) {
                        l = m;
                    } else {
                        r = m;
                    }
                }
                count += r;
            }
            if (a[i] * a[i] < n) count--;
        }
        count /= 2;
        return count < k;
    }
}