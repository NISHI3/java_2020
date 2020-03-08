import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @File: ex29
 * @Description: N枚の鏡餅を重ねていくとき、最大何枚積み重ねることができるか
 * @Input:
 * ------
 * N
 * A1
 * .
 * An
 * ------
 */
public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> num = new HashSet<>();
        for (int i=0; i< N; i++) {
            int mochi = sc.nextInt();
            num.add(mochi);
        }
        System.out.println(num.size());;
    }
}
