package java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @File: ex57
 * @Description: 数字が、言った順番に A1,...,AN として与えられるので、ゲーム終了後に紙に書かれている数字がいくつあるか答えてください。
 * @Input:
 * ------
 * X
 * A1
 * .
 * An
 * ------
 */
public class ex58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i< N; i++) {
            int num = sc.nextInt();
            if (nums.contains(num)) {
                nums.remove(num);
            } else {
                nums.add(num);
            }
        }
        System.out.println(nums.size());
    }
}