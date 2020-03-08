/**
 * Name ex08.java
 * Description 繰り返し(do-while)
 */
public class ex08 {
    public static void main(String[] args) {
        int i = 7;
        do {
            System.out.println("i = " + i);
            i -= 4;
        } while (i > 0);

        System.out.println("0を下回ったので終了です");

        i = -3;
        do {
            System.out.println("i = " + i);
            i -= 4;
        } while (i > 0);

        System.out.println("0を下回ったので終了です");
    }
}
