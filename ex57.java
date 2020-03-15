package java;

import java.util.Scanner;

/**
 * @File: ex56
 * @Description: ナイトの駒をマス (X,Y) まで移動させる方法は何通りありますか？
 * @Input: ------
 * X Y
 * ------
 */
public class ex57 {
    public static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if ((X + Y) % 3 != 0) {
            System.out.println(0);
            return;
        }
        int N = (X + Y) / 3;
        int dx = X - N;
        int dy = Y - N;
        if (dx < 0 || dy < 0) {
            System.out.println(0);
            return;
        }
        if (dx < dy) {
            int t = dx;
            dx = dy;
            dy = t;
        }
        long u = 1;
        for (int i = dx + dy; i > dx; i--) u = (u * i) % MOD;
        long l = 1;
        for (int i = dy; i >= 1; i--) l = (l * i) % MOD;

        int inv = extgcd((int) l, MOD)[1];

        System.out.println((u * inv) % MOD);
    }

    static int[] extgcd(int a, int b) {
        int aa = a, bb = b;
        int x0 = 1, x1 = 0;
        int y0 = 0, y1 = 1;

        while (b != 0) {
            int q = a / b;
            int r = a % b;
            int x2 = x0 - q * x1;
            int y2 = y0 - q * y1;

            a = b; b = r;
            x0 = x1; x1 = x2;
            y0 = y1; y1 = y2;
        }
        if (bb > 0 && x0 < 0) {
            int n = -x0/bb;
            if (-x0%bb != 0) n++;
            x0 += n*bb; y0 -= n*aa;
        }
        return new int[]{a, x0, y0};
    }
}