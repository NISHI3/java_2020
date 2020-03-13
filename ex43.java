import java.util.Scanner;

/**
 * @File: ex43
 * @Description: A 秒後にスイッチを押し始め、ロボットを動かし始めてB秒後にスイッチを離しました。C秒後にスイッチを押し始め、ロボットを動かし始めてD秒後にスイッチを離しました。
 * @Input:
 * ------
 * A B C D
 * ------
 */
public class ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[4];
        for (int i = 0; i < 4; i++) {
            n[i] = sc.nextInt();
        }
        int m = Math.min(n[1], n[3]) -  Math.max(n[0], n[2]);
        if (m < 0) {
            m = 0;
        }
        System.out.println(m);
    }
}