import java.util.Scanner;

/**
 * @File: ex38
 * @Description: Xと753の差（の絶対値）は最小でいくつになるでしょうか？
 * @Input:
 * ------
 * N
 * ------
 */
public class ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        int n = 753;
        for (int i = 0; i < X.length() - 2; i++) {
            int num = Integer.parseInt(X.substring(i, i + 3));
            int a = Math.abs(num - 753);
            if (a <= n) {
                n = a;
            }
        }
        System.out.println(n);
    }
}