import java.util.Scanner;

/**
 * @File: ex52
 * @Description: 九九足し算
 * @Input:
 * ------
 * N
 * ------
 */
public class ex52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 2025 - sc.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i * j == N) {
                    System.out.println(i + " x " + j);
                }
            }
        }
    }
}