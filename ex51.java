import java.util.Scanner;

/**
 * @File: ex51
 * @Description: A?B?C?D=7になるように?に+/-を入れよ
 * @Input:
 * ------
 * ABCD
 * ------
 */
public class ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int length = s.length - 1;
        for (int i = 0; i < Math.pow(2, length); i++) {
            int sum = Integer.parseInt(s[0]);
            StringBuilder ans = new StringBuilder(s[0]);
            for (int j = 0; j < length; j++) {
                if((1&i>>j) == 1) {
                    sum += Integer.parseInt(s[j + 1]);
                    ans.append("+").append(s[j + 1]);
                } else {
                    sum -= Integer.parseInt(s[j + 1]);
                    ans.append("-").append(s[j + 1]);
                }
            }
            if (sum == 7) {
                System.out.println(ans.append("=7").toString());
                break;
            }
        }
    }
}