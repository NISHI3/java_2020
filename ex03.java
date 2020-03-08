import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Name ex03.java
 * Description 標準入力の練習　自己紹介を作る.
 */
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("名前を入力:");
            String name = sc.nextLine();
            System.out.print("年齢を入力:");
            int age = sc.nextInt();

            System.out.println("私の名前は" + name + "で、年齢は" + age + "歳です。");

        } catch (InputMismatchException ignored) {
            System.out.println("不正な入力です。");
        }

    }
}
