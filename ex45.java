import java.util.Scanner;

/**
 * @File: ex45
 * @Description: N 個のボールをそれぞれ K 色のペンキの色のうちのどれかで塗ろうとしています.ボールの塗り方としてあり得るものの個数を求めてください。
 * @Input:
 * ------
 * N K
 * ------
 */
public class ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a = K;
        for (int i = 1; i < N; i++) {
            a *= K - 1;
        }
        System.out.println(a);
    }
}