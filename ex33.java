import java.util.Scanner;

/**
 * @File: ex33
 * @Description: 文字列 S の K 文字目を小文字に書き換え、新しくできた S を出力してください。
 * @Input:
 * ------
 * N K
 * S
 * ------
 */
public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] c = sc.next().toCharArray();
        // ASCIIコードで32ずらす
        c[k - 1] += 32;
        System.out.println(new String(c));
    }
}