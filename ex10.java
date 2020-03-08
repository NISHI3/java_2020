import java.util.Scanner;

/**
 * Name ex11.java
 * Description
 */
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;

        do {
            System.out.print("自然数を入力してください:");
            num = sc.nextInt();
        } while (num < 0);

        for (int i = 1; i < num; i++) {
            if ((i % 15) == 0) {
                System.out.println("FizzBuzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
