import java.util.*;

/**
 * @File: ex21
 * @Description: aとbの咳が偶数蚊奇数か判定してください。
 * @Input:
 * ------
 * a b
 * ------
 */
public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a * b) % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
