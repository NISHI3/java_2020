import java.util.Scanner;

/**
 * @File: ex23
 * @Description: 野球の審判(ball/strike)
 * @Input:
 * ------
 * N
 * A1
 * .
 * An
 * ------
 */
public class ex23 {
    public static int ballcount = 1;
    public static int strikecount = 1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            String in = sc.next();
            if (in.equals("ball")) {
                count_ball();
            } else {
                count_strike();
            }
        }
    }

    public static void count_ball() {
        if (ballcount == 4) {
            System.out.println("fourball!");
        } else {
            System.out.println("ball!");
        }
        ballcount++;
    }

    public static void count_strike() {
        if (strikecount == 3) {
            System.out.println("out!");
        } else {
            System.out.println("strike!");
        }
        strikecount++;
    }
}
