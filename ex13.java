import java.util.Scanner;
/**
 * Name ex13.java
 * Description 配列の利用
 */
public class ex13 {
    public static void main(String[] args) {
        int[] month_d = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day, sum_day = 0, i = 0;
        do {
            Scanner sc = new Scanner(System.in);
            day = sc.nextInt();
        } while (day <= 0 || day >= 367);

        while (sum_day < day) {
            sum_day += month_d[i];
            i++;
        }
        System.out.println(i + "月です。");

    }
}
