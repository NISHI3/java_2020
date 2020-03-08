import java.util.Scanner;

/**
 * Name ex11.java
 * Description fizzbuzz
 */
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("判定したい自然数を入力:");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("素数ではないです。");
                System.exit(0);
            }
        }
        System.out.println("素数です。");
    }
}
