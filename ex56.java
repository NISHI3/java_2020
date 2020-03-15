import java.util.Scanner;

/**
 * @File: ex56
 * @Description: 正の整数 N が与えられます。N 以下の正の整数の組 (A,B)であって、次の条件を満たすものの個数を求めてください。
 * @Input: ------
 * N
 * ------
 */
public class ex56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x[][] = new int[10][10];
        int tmp = 0;
        long ans = 0;
        for (int i = 1; i < N; i++) {
            if (i == Math.pow(10, tmp + 1)) {
                tmp++;
            }
            int pow = (int) Math.pow(10, tmp);
            x[i / pow][i % 10]++;
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                ans += (long) x[i][j] * x[j][i];
            }
        }
        System.out.println(ans);
    }
}