import java.util.Scanner;

/**
 * @File: ex44
 * @Description: i回目のトレーニングを終えるとパワーがi倍されます. 答えの値は非常に大きな値になることがあるので 109+7 で割ったあまりを出力してください。
 * @Input:
 * ------
 * N
 * ------
 */
public class ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long init = 1;
        for(long i = 2; i <= N; i++)
        {
            init *= i;
            init = init % 1000000007;
        }

        System.out.println(init);
    }
}