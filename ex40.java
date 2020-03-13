import java.util.Scanner;

/**
 * @File: ex40
 * @Description: 3桁の整数nが与えられます。nに含まれる1という桁をそれぞれ9に、9という桁をそれぞれ1に置き換えて得られる整数を出力してください。
 * @Input:
 * ------
 * n
 * ------
 */
public class ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String n[] = new String[3];
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == '1') {
                n[i] = "9";
            } else {
                n[i] = "1";
            }
        }
        for (String a: n) {
            System.out.print(a);
        }
        System.out.println();
    }
}