import java.util.Scanner;

/**
 * Name ex05.java
 * Description 分岐（if）
 */
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("点数を入力してください:");
        int point = sc.nextInt();

        if (point < 40) {
            System.out.println("不合格です。");
        } else {
            System.out.println("合格です。");
        }
    }
}
