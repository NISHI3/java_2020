import java.util.Scanner;

/**
 * @File: ex41
 * @Description:
 * @Input:
 * ------
 * n
 * A
 * B
 * ------
 */
public class ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Hello World");
        }
        if(n==2){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}