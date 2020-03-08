import java.util.Scanner;

/**
 * @File: ex30
 * @Description: お年玉として、10000円札、5000円札、1000円札がN枚入って、合計Y円だったとき、入っている候補を見つけてください。また、Y円になることがありえないとき、'-1 -1 -1'と出力せよ
 * @Input: ------
 * N Y
 * ------
 */
public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                int k = N - i - j;
                int total = i * 10000 + j * 5000 + k * 1000;
                if (total == Y) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
