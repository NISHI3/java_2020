import java.util.Scanner;

/**
 * @File: ex53
 * @Description: A, B, Cをすべて等しくできることを証明せよ。
 * @Input:
 * ------
 * A B C
 * ------
 */
public class ex53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int max = Math.max(A, Math.max(B, C));
        int min = Math.min(A, Math.min(B, C));
        int mid = A + B + C - max - min;

        int cnt = max - mid;
        min += cnt;
        cnt += (max - min + 1) / 2;
        if ((max - min) % 2 != 0) cnt++;
        System.out.println(cnt);
    }
}