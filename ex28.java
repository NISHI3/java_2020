import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @File: ex28
 * @Description: N枚のカードがあり、カードにはAiという点が書かれています。A,Bの二人で皇后に取り合い、二人の点数が最大化する場合、AがBより何点多く取れるか求めなさい。
 * @Input:
 * ------
 * N
 * A1 A2 ... An
 * ------
 */
public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer cards[] = new Integer[num];
        for (int i = 0; i < num; i++) {
            cards[i] = sc.nextInt();
        }

        Arrays.sort(cards, Comparator.reverseOrder());

        int A = 0;
        int B = 0;

        for (int i = 0; i < num; i += 2) {
            A += cards[i];
        }
        for (int i = 1; i < num; i += 2) {
            B += cards[i];
        }
        System.out.println(A - B);
    }

}
