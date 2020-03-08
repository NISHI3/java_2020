import java.util.Scanner;

/**
 * Name ex12.java
 * Description 関数定義
 */
public class
ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("自然数を入力:");
        int num = sc.nextInt();

        System.out.println(fib(num));
    }

    public static int fib(int x){
        if(x == 0 || x == 1){
            return 1;
        }else{
            return fib(x-1) + fib(x-2);
        }
    }
}
