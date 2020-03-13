import java.util.Scanner;

/**
 * @File: ex37
 * @Description: N個のボタンがあり、大きさはそれぞれ A,B です。最大で何枚のコインを獲得できるでしょうか。
 * @Input:
 * ------
 * A B
 * ------
 */
public class ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (Math.abs(A - B) == 0) {
            // 同じ値のとき足す
            System.out.println(A + B);
        } else {
            // 大きい方*2-1
            System.out.println(Math.max(A, B) * 2 - 1);
        }
    }
}