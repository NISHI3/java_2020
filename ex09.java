import java.util.Scanner;

/**
 * Name ex09.java
 * Description 繰り返し（for）
 */
public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力してください。");
        int num = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact *= i;
            System.out.println(i + "! = " + fact);
        }
    }
}
