import java.util.Scanner;

/**
 * @File: ex50
 * @Description:
 * @Input: ------
 * N
 * S
 * ------
 */
public class ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int[] west = new int[N];
        int[] east = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            west[i] = sum;
            if (c[i] == 'W') {
                sum++;
            }
        }
        sum = 0;
        for (int i = N - 1; i >= 0; i--) {
            east[i] = sum;
            if (c[i] == 'E') {
                sum++;
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (west[i] + east[i] < result) {
                result = west[i] + east[i];
            }
        }
        System.out.println(result);
    }
}