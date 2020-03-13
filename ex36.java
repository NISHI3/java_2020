package java;

import java.util.Scanner;

/**
 * @File: ex36
 * @Description: N枚すべてのせんべいを配るとき、せんべいを最も多くもらった人と最も少なくもらった人のもらったせんべいの枚数の差(の絶対値)の最小値を求めてください。
 * @Input:
 * ------
 * N K
 * ------
 */
public class ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (N % K == 0) {
            System.out.println('0');
        } else {
            System.out.println('1');
        }
    }
}