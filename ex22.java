import java.util.Scanner;

/**
 * @File: ex22
 * @Description: 0と1が3桁の数字から1がいくつあるかを求めてください。
 * @Input: ------
 * a[0,1の３桁]
 * ------
 */
public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

        // 一文字づつ”1”か判別してcountを足していく方法
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == '1') count++;
        }
        System.out.println(count);

        // 0を消してく1の数を数える方法
//        s = s.replace("0", "");
//        System.out.println(s.length());
    }
}
