import java.util.Scanner;

/**
 * @File: ex24
 * @Description: 入力されたN個の整数を2で割ったとき、何回割ることができるか求めてください
 * @Input: ------
 * N
 * A1 A2 ... An
 * ------
 */
public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int bit = 0;
        for (int i = 0; i < num; i++) {
            // すべての数値を2進数で比較する
            bit |= sc.nextInt();
        }
        // 最下位の0の数を調べる
        System.out.println(Integer.numberOfTrailingZeros(bit));
    }
}
