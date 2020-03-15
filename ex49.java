import java.util.Scanner;

/**
 * @File: ex49
 * @Description:
 * @Input:
 * ------
 * N
 * A1,1 ... An,n
 * A2,1 ... An,n
 * ------
 */
public class ex49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] a = new int[2][N];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int max = 0;
            for (int j = 0; j <= i; j++) {
                max += a[0][j];
            }
            for (int j = i; j < N; j++) {
                max += a[1][j];
            }
            ans = Math.max(ans, max);
        }
        System.out.println(ans);
    }
}