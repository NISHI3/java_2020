import java.util.Scanner;

/**
 * @File: ex25
 * @Description: マインスイーパー
 * @Input: ------
 * H[高さ] W[横幅]
 * S1
 * .
 * Sn
 * ------
 */
public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        char[][] field = new char[height][width];
        int[] dx = new int[]{1, -1, 0, 0, 1, -1, 1, -1};
        int[] dy = new int[]{0, 0, -1, 1, -1, -1, 1, 1};

        for (int i = 0; i < height; i++) {
            field[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (field[i][j] == '#') continue;
                int count = 0;
                for (int k = 0; k < 8; k++) {
                    int nextX = i + dx[k];
                    int nextY = j + dy[k];
                    if (0 <= nextX && nextX < height && 0 <= nextY && nextY < width && field[nextX][nextY] == '#')
                        count++;
                }
                field[i][j] = (char) (count + '0');
            }
        }
        for (int i = 0; i < height; i++) {
            System.out.println(new String(field[i]));
        }
    }
}
