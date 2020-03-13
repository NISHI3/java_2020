import java.util.Scanner;

/**
 * @File: ex20
 * @Description: 2つの正整数a,bが与えられます。a,bの平均値をxとします。xの小数点以下を切り上げて得られる整数を出力してください。
 * @Input:
 * ------
 * a b
 * ------
 */
public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();

        System.out.println((a + b + 1) / 2);
    }
}
