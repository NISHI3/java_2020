import java.util.Scanner;

/**
 * @File: ex48
 * @Description:
 * @Input: ------
 * N
 * a1
 * .
 * an
 * ------
 */
public class ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt() - 1;
        }
        int count = 0;
        int now = 0;
        while (true) {
            if (now == 1) {
                System.out.println(count);
                break;
            }
            if (count >= N) {
                System.out.println(-1);
                break;
            }
            count++;
            now = a[now];
        }
    }
}