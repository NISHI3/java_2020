import java.util.Scanner;

/**
 * @File: ex31
 * @Description:
 * @Input: ------
 * S
 * ------
 */
public class ex31 {
    static String[] strs = {
            "dream",
            "dreamer",
            "erase",
            "eraser"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        while (true) {
            Boolean boolEnd = false;
            for (String str : strs) {
                if (s.endsWith(str)) {
                    boolEnd = true;
                    s = s.substring(0, s.length() - str.length());
                    break;
                }
            }
            if (!boolEnd) {
                System.out.println("NO");
                break;
            }
            if (s.length() <= 0) {
                System.out.println("YES");
                break;
            }
        }
    }
}
