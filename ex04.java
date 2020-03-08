import java.util.Scanner;

/**
 * Name ex04.java
 * Description 標準出力の練習２　計算（BMIの算出）
 */
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("身長を入力:");
        double length = sc.nextDouble();
        System.out.print("体重を入力:");
        double weight = sc.nextDouble();

        double bmi = weight/(length * length);
        System.out.print("あなたのBMIは、");
        System.out.print(String.format("%.1f",bmi));
        System.out.println("です。");
    }
}
