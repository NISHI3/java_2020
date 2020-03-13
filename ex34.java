import java.util.Scanner;

/**
 * @File: ex34
 * @Description: N時間駐車するとき、駐車料金は最小でいくらになるか求めてください。
 * @Input:
 * ------
 * N A B
 * ------
 */
public class ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.min(N * A, B));
    }
}