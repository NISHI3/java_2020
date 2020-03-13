import java.util.Scanner;

/**
 * @File: ex46
 * @Description: 非負の整数a, b(a ≤ b)と、正の整数xが与えられます。a以上b以下の整数のうち、xで割り切れるものの個数を求めてください
 * @Input:
 * ------
 * a b x
 * ------
 */
public class ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long cnt = 0;
        if (a % x == 0) cnt++;
        cnt += (b / x) - (a / x);
        System.out.println(cnt);
    }
}