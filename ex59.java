package java;

import java.util.Scanner;

/**
 * @File: ex59
 * @Description: Move and Win
 * @Input:
 * ------
 * N A B
 * ------
 */
public class ex59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (Math.abs(B - A - 1) % 2 != 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
    }
}